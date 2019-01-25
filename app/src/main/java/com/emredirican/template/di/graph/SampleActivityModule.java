package com.emredirican.template.di.graph;

import com.emredirican.template.SampleActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        SampleActivityComponent.class
})
public abstract class SampleActivityModule {

    @Binds
    @IntoMap
    @ClassKey(SampleActivity.class)
    abstract AndroidInjector.Factory<?>
        bindSampleActivityInjectorFactory(SampleActivityComponent component);

}
