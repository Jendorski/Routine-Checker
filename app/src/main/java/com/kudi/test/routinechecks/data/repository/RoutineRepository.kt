package com.kudi.test.routinechecks.data.repository

import com.kudi.test.routinechecks.data.dao.RoutineDao
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository to handle data operations
 */
@Singleton
class RoutineRepository @Inject constructor(private val dao: RoutineDao){



}
