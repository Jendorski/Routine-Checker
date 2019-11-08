package com.kudi.test.routinechecks.viewModel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kudi.test.routinechecks.viewModel.RoutineViewModel
import javax.inject.Inject

open class RoutineViewModelFactory @Inject constructor(private val routineViewModel: RoutineViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RoutineViewModel::class.java)) {
            return routineViewModel as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}