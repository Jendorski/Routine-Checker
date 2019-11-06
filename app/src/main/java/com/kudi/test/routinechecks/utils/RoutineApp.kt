package com.kudi.test.routinechecks.utils

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

open class RoutineApp: DaggerApplication(){

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}