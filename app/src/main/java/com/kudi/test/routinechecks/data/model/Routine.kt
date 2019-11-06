package com.kudi.test.routinechecks.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Routine", primaryKeys = ["time", "title"])
data class Routine (
    val time: Long,
    val description: String,
    val title: String,
    val done: Boolean,
    val missed: Boolean
){

    override fun toString(): String {
        return "Routine(time=$time, description='$description', title='$title', done=$done, missed=$missed)"
    }
}