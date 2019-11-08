package com.kudi.test.routinechecks.utils

import android.app.Activity
import android.app.Application
import com.facebook.stetho.Stetho
import com.kudi.test.routinechecks.BuildConfig
import com.kudi.test.routinechecks.dagger.di.AppInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

open class RoutineApp: Application(), HasActivityInjector {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) Stetho.initializeWithDefaults(this)

        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        else Timber.plant(CrashReportingTree())

        AppInjector.init(this)

    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = dispatchingAndroidInjector


}