package com.kudi.test.routinechecks.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kudi.test.routinechecks.data.model.Routine

@Dao
interface RoutineDao {

    @Query("SELECT * FROM routine ORDER BY time DESC")
    fun getLegoThemes(): LiveData<List<Routine>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(plants: List<Routine>)


}