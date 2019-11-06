package com.kudi.test.routinechecks.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.kudi.test.routinechecks.data.database.RoutineCheckDatabase
import com.kudi.test.routinechecks.data.model.Routine
import com.kudi.test.routinechecks.utils.DATA_FILENAME
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import timber.log.Timber

/**
 * This class is to help in preloading databse items when the database event is fired.
 *
 */
class SeedDatabaseWorker(
    context: Context,
    workerParams: WorkerParameters
):CoroutineWorker(context, workerParams){

    override suspend fun doWork(): Result  = coroutineScope{
        withContext(Dispatchers.IO){
            try {
                applicationContext.assets.open(DATA_FILENAME).use { inputStream ->
                    JsonReader(inputStream.reader()).use { jsonReader ->
                        val type = object : TypeToken<List<Routine>>() {}.type
                        val list: List<Routine> = Gson().fromJson(jsonReader, type)

                        RoutineCheckDatabase.getInstance(applicationContext).routineDao().insertAll(list)

                        Result.success()
                    }
                }
            } catch (e: Exception) {
                Timber.e(e, "Error seeding database")
                Result.failure()
            }

        }
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}