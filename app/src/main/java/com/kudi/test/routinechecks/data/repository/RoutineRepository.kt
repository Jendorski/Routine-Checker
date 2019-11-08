package com.kudi.test.routinechecks.data.repository

import androidx.lifecycle.LiveData
import com.kudi.test.routinechecks.data.dao.RoutineDao
import com.kudi.test.routinechecks.data.model.Routine
import io.reactivex.Observable
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository to handle data operations
 */
@Singleton
class RoutineRepository @Inject constructor(private val dao: RoutineDao){

    fun getRoutines(): Observable<List<Routine>> {
        return Observable.just(dao.getRoutines())
            .doOnNext {
                Timber.e(it.size.toString())
            }
    }

    fun getARoutine(title: String): LiveData<Routine>{
        return dao.getARoutine(title)
    }

    suspend fun insertARoutine(routine: Routine){
        dao.insert(routine)
    }

    companion object {
        @Volatile
        private var instance: RoutineRepository? = null

        fun getInstance(dao: RoutineDao) = instance ?: synchronized(this) {
            instance ?: RoutineRepository(dao).also { instance = it }
        }
    }

}
