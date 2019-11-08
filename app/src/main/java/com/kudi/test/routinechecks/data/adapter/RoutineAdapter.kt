package com.kudi.test.routinechecks.data.adapter

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import com.kudi.test.routinechecks.data.model.Routine

class RoutineAdapter : PagedListAdapter<Routine, RoutineViewHolder>(RoutineDiffCallback())  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutineViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RoutineViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}