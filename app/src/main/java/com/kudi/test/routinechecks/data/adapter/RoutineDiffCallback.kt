package com.kudi.test.routinechecks.data.adapter

import androidx.recyclerview.widget.DiffUtil
import com.kudi.test.routinechecks.data.model.Routine

open class RoutineDiffCallback : DiffUtil.ItemCallback<Routine>() {

    override fun areItemsTheSame(oldItem: Routine, newItem: Routine): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: Routine, newItem: Routine): Boolean {
        return oldItem == newItem
    }
}