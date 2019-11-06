package com.elifox.legocatalog.di;

import com.kudi.test.routinechecks.dagger.fragments.NextUpFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeLegoSetFragment.NextUpFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLegoSetFragment {
  private FragmentBuildersModule_ContributeLegoSetFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NextUpFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NextUpFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NextUpFragmentSubcomponent extends AndroidInjector<NextUpFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NextUpFragment> {}
  }
}
