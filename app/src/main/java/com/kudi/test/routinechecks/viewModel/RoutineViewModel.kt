package com.kudi.test.routinechecks.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kudi.test.routinechecks.dagger.di.CoroutineScropeIO
import com.kudi.test.routinechecks.data.model.Routine
import com.kudi.test.routinechecks.data.repository.RoutineRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RoutineViewModel @Inject constructor(private val repository: RoutineRepository,
                                           @CoroutineScropeIO private val ioCoroutineScropeIO: CoroutineScope)
    : ViewModel() {

    var routineResult: MutableLiveData<List<Routine>> = MutableLiveData()
    var routineError: MutableLiveData<String> = MutableLiveData()
    var routineLoader: MutableLiveData<Boolean> = MutableLiveData()

    private lateinit var disposableObserver: DisposableObserver<List<Routine>>

    fun routineResult(): LiveData<List<Routine>> {
        return routineResult
    }

    fun loadRoutine() {

        disposableObserver = object : DisposableObserver<List<Routine>>() {
            override fun onComplete() {}

            override fun onNext(cryptoCurrencies: List<Routine>) {
                routineResult.postValue(cryptoCurrencies)
                routineLoader.postValue(false)
            }

            override fun onError(e: Throwable) {
                routineError.postValue(e.message)
                routineLoader.postValue(false)
            }
        }

        repository.getRoutines()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .debounce(400, TimeUnit.MILLISECONDS)
            .subscribe(disposableObserver)
    }

    override fun onCleared() {
        super.onCleared()
        ioCoroutineScropeIO.cancel()
    }

    fun disposeElements() {
        if (!disposableObserver.isDisposed) disposableObserver.dispose()
    }

}