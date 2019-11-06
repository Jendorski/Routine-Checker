package com.elifox.legocatalog.di


import com.kudi.test.routinechecks.dagger.fragments.NextUpFragment
import com.kudi.test.routinechecks.dagger.fragments.RoutinesFragment
import com.kudi.test.routinechecks.dagger.fragments.SettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeThemeFragment(): RoutinesFragment

    @ContributesAndroidInjector
    abstract fun contributeLegoSetsFragment(): SettingsFragment

    @ContributesAndroidInjector
    abstract fun contributeLegoSetFragment(): NextUpFragment

}
