package com.kudi.test.routinechecks.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kudi.test.routinechecks.data.model.Routine

@Dao
interface RoutineDao {

    @Query("SELECT * FROM routine ORDER BY title DESC")
    fun getRoutines(): List<Routine>

    @Query("SELECT * FROM routine WHERE :title")
    fun getARoutine(title: String): LiveData<Routine>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(routines: List<Routine>)

    @Insert
    fun insert(routine: Routine)

}