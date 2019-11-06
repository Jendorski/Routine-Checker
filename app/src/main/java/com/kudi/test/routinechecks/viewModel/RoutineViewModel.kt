package com.kudi.test.routinechecks.viewModel

import androidx.lifecycle.ViewModel
import com.elifox.legocatalog.di.CoroutineScropeIO
import com.kudi.test.routinechecks.data.repository.RoutineRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import javax.inject.Inject

class RoutineViewModel @Inject constructor(private val repository: RoutineRepository,
                                           @CoroutineScropeIO private val ioCoroutineScropeIO: CoroutineScope)
    : ViewModel() {
    var connectivityAvailable : Boolean = false
    var missed: Boolean = false
    var done: Boolean = false

    val routines by lazy{

    }

    override fun onCleared() {
        super.onCleared()
        ioCoroutineScropeIO.cancel()
    }
}