package com.kudi.test.routinechecks.dagger.activities

import android.app.Activity
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.HasSupportFragmentInjector

open class BaseActivity : DaggerAppCompatActivity(), HasSupportFragmentInjector, HasActivityInjector {

    override fun activityInjector(): AndroidInjector<Activity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}