package com.kudi.test.routinechecks.dagger.fragments

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.kudi.test.routinechecks.R
import com.kudi.test.routinechecks.databinding.AddRoutineBinding
import com.kudi.test.routinechecks.viewModel.AddRoutineViewModel
import com.kudi.test.routinechecks.viewModel.factory.AddRoutineViewModelFactory
import javax.inject.Inject

class AddRoutine : BaseFragment() {

    @Inject
    lateinit var routineViewFactory: AddRoutineViewModelFactory

    private lateinit var routineViewModel: AddRoutineViewModel

    lateinit var addRoutine : AddRoutineBinding

    lateinit var addRoutineView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        routineViewModel = ViewModelProviders.of(this, routineViewFactory).get(
            AddRoutineViewModel::class.java)

        addRoutine = DataBindingUtil.inflate<AddRoutineBinding>(
            inflater, R.layout.add_routine, container, false).apply {

            lifecycleOwner = this@AddRoutine

        }

        addRoutineView = addRoutine.root

        setHasOptionsMenu(true)

        return addRoutineView

    }

    override fun getTitle(): String? {
        return "Add Routine"
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.add_routine_menu, menu)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.check_routine_tool_bar_icon -> {
                /// Save the data
                routineViewModel.h(addRoutine)
                true
            }
            R.id.cancel_routine_tool_bar_icon -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}