package com.kudi.test.routinechecks.dagger.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.kudi.test.routinechecks.viewModel.RoutineViewModel
import javax.inject.Inject

open class NextUpFragment : BaseFragment(){

    private val TAG: String = NextUpFragment::class.java.simpleName

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: RoutineViewModel

    //private val args: RoutineFragmentArgs by navArgs<>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun getTitle(): String? {
        return "Next Up"
    }

}
