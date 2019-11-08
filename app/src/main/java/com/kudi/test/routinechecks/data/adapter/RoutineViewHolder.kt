package com.kudi.test.routinechecks.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kudi.test.routinechecks.data.model.Routine
import com.kudi.test.routinechecks.databinding.ListItemRoutinesBinding

open class RoutineViewHolder(private val binding: ListItemRoutinesBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(listener: View.OnClickListener, item: Routine,
             isGridLayoutManager: Boolean) {
        binding.apply {
            clickListener = listener
            routine = item
            title.visibility = if (isGridLayoutManager) View.GONE else View.VISIBLE
            executePendingBindings()
        }
    }
}
