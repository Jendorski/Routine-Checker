package com.kudi.test.routinechecks.dagger.fragments

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kudi.test.routinechecks.R
import com.kudi.test.routinechecks.dagger.di.injectViewModel
import com.kudi.test.routinechecks.dagger.ui.GridSpacingItemDecoration
import com.kudi.test.routinechecks.dagger.ui.VerticalItemDecoration
import com.kudi.test.routinechecks.data.adapter.RoutineAdapter
import com.kudi.test.routinechecks.databinding.RoutinesBinding
import com.kudi.test.routinechecks.viewModel.RoutineViewModel
import javax.inject.Inject

class RoutinesFragment : BaseFragment() {
    override fun getTitle(): String? {
        return "Routines"
    }

    private val TAG: String = RoutinesFragment::class.java.simpleName

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: RoutineViewModel

    private lateinit var binding: RoutinesBinding
    private val adapter: RoutineAdapter by lazy { RoutineAdapter() }
    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var gridLayoutManager: GridLayoutManager
    private val linearDecoration: RecyclerView.ItemDecoration by lazy {
        VerticalItemDecoration(
            resources.getDimension(R.dimen.margin_normal).toInt())
    }

    private val gridDecoration: RecyclerView.ItemDecoration by lazy {
        GridSpacingItemDecoration(
            SPAN_OBJECT, resources.getDimension(R.dimen.margin_grid).toInt())
    }

    private var isLinearLayoutManager: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        setMenuVisibility(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = injectViewModel(viewModelFactory)

        binding = RoutinesBinding.inflate(inflater, container, false)
        context ?: return binding.root

        linearLayoutManager = LinearLayoutManager(activity)
        gridLayoutManager = GridLayoutManager(activity, SPAN_OBJECT)
        setLayoutManager()
        binding.recyclerView.adapter = adapter

        //setTitle("My Routines")

        subscribeUi(adapter)

        val binding = DataBindingUtil.inflate<RoutinesBinding>(

            inflater, R.layout.routines, container, false).apply {

            lifecycleOwner = this@RoutinesFragment
        }

        setHasOptionsMenu(true)
        setMenuVisibility(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater!!.inflate(R.menu.routine_menu, menu)
        //setDataRepresentationIcon(menu.findItem(R.id.add_routine_tool_bar_icon))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.add_routine_tool_bar_icon -> {
                Log.d(TAG, "ADD ROUTINE")
                openFragment(AddRoutine())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.main_frame_layout, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }

    private fun setLayoutManager() {
        val recyclerView = binding.recyclerView

        var scrollPosition = 0
        // If a layout manager has already been set, get current scroll position.
        if (recyclerView.layoutManager != null) {
            scrollPosition = (recyclerView.layoutManager as LinearLayoutManager)
                .findFirstCompletelyVisibleItemPosition()
        }

        if (isLinearLayoutManager) {
            recyclerView.removeItemDecoration(gridDecoration)
            recyclerView.addItemDecoration(linearDecoration)
            recyclerView.layoutManager = linearLayoutManager
        } else {
            recyclerView.removeItemDecoration(linearDecoration)
            recyclerView.addItemDecoration(gridDecoration)
            recyclerView.layoutManager = gridLayoutManager
        }

        recyclerView.scrollToPosition(scrollPosition)
    }

    private fun subscribeUi(adapter: RoutineAdapter) {
//        viewModel.routines.observe(viewLifecycleOwner) {
//            binding.progressBar.hide()
//            adapter.submitList(it)
//        }
    }

    companion object {
        const val SPAN_OBJECT = 3
    }


}
