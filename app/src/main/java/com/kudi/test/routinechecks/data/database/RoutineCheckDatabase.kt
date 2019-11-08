package com.kudi.test.routinechecks.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.kudi.test.routinechecks.data.Converters
import com.kudi.test.routinechecks.data.dao.RoutineDao
import com.kudi.test.routinechecks.data.model.Routine
import com.kudi.test.routinechecks.worker.SeedDatabaseWorker

/**
 * The Room database for this app
 */
@Database(entities = [Routine::class/*, */],
    version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RoutineCheckDatabase : RoomDatabase(){

    abstract fun routineDao(): RoutineDao

    companion object {

        //For singleton instantion
        @Volatile
        private var instance: RoutineCheckDatabase? = null

        fun getInstance(context: Context): RoutineCheckDatabase{
            return instance ?: synchronized(this){
                instance ?: buildDatabase(context).also{ instance = it}
            }
        }

        private fun buildDatabase(context:Context) : RoutineCheckDatabase{
            return Room.databaseBuilder(context, RoutineCheckDatabase::class.java,
                "routine-check.db")
                .addCallback(object : RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        val request = OneTimeWorkRequestBuilder<SeedDatabaseWorker>().build()
                        WorkManager.getInstance(context).enqueue(request)
                    }
                })
                .build()
        }
    }

}
