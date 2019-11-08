package com.kudi.test.routinechecks.viewModel

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.kudi.test.routinechecks.data.dao.RoutineDao
import com.kudi.test.routinechecks.data.model.Routine
import com.kudi.test.routinechecks.databinding.AddRoutineBinding
import io.reactivex.Observable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AddRoutineViewModel @Inject constructor(private val daos: RoutineDao) : ViewModel() {

    lateinit var title: String

    //suspend fun addRoutine() = RoutineRepository.getInstance(dao = daos).addTask()

    @RequiresApi(Build.VERSION_CODES.M)
    fun h(addRoutine: AddRoutineBinding){
        val desc: String = addRoutine.descEditText.text.toString()
        val title: String = addRoutine.titleEditText.text.toString()
        val hour: Int = addRoutine.timePicker.hour
        val min: Int = addRoutine.timePicker.minute
        val time: String = "$hour:$min"

        val r = Routine(time, desc, title, false, false)

        Observable.just(daos).subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .subscribe(Consumer { t -> t.insert(r) })
    }

    override fun onCleared() {
        super.onCleared()
    }

}