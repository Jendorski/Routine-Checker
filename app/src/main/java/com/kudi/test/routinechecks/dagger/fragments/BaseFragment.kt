package com.kudi.test.routinechecks.dagger.fragments

import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment(){

    protected abstract fun getTitle(): String?

    override fun onResume() {
        super.onResume()
        activity?.title = getTitle()
    }
}