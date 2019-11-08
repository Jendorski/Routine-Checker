package com.kudi.test.routinechecks.viewModel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kudi.test.routinechecks.viewModel.AddRoutineViewModel
import javax.inject.Inject

open class AddRoutineViewModelFactory @Inject constructor(private val addRoutineViewModel: AddRoutineViewModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddRoutineViewModel::class.java)) {
            return addRoutineViewModel as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}