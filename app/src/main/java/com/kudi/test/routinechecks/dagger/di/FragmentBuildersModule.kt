package com.kudi.test.routinechecks.dagger.di


import com.kudi.test.routinechecks.dagger.fragments.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeRoutineFragment(): RoutinesFragment

    @ContributesAndroidInjector
    abstract fun contributeSettingsFragment(): SettingsFragment

    @ContributesAndroidInjector
    abstract fun contributeNextUpFragment(): NextUpFragment

    @ContributesAndroidInjector
    abstract fun contributeAddRoutineFragment(): AddRoutine

    @ContributesAndroidInjector
    abstract fun contributeARoutineFragment(): ARoutineFragment

}
