package com.elifox.legocatalog.di;

import com.kudi.test.routinechecks.dagger.fragments.SettingsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeLegoSetsFragment.SettingsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLegoSetsFragment {
  private FragmentBuildersModule_ContributeLegoSetsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SettingsFragmentSubcomponent extends AndroidInjector<SettingsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsFragment> {}
  }
}
