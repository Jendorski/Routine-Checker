package com.elifox.legocatalog.di;

import com.kudi.test.routinechecks.dagger.fragments.RoutinesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeThemeFragment.RoutinesFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeThemeFragment {
  private FragmentBuildersModule_ContributeThemeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RoutinesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RoutinesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RoutinesFragmentSubcomponent extends AndroidInjector<RoutinesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RoutinesFragment> {}
  }
}
