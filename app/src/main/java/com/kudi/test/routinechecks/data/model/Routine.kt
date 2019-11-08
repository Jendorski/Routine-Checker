package com.kudi.test.routinechecks.data.model

import androidx.room.Entity

@Entity(tableName = "Routine", primaryKeys = ["time", "title"])
data class Routine (
    val time: String,
    val description: String,
    val title: String,
    val done: Boolean,
    val missed: Boolean
){

    override fun toString(): String {
        return "Routine(time=$time, description='$description', title='$title', done=$done, missed=$missed)"
    }
}