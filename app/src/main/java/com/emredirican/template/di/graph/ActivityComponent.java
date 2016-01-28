package com.emredirican.template.di.graph;

import com.emredirican.template.SampleActivity;
import com.emredirican.template.di.module.ActivityModule;
import dagger.Subcomponent;

@PerActivity @Subcomponent(modules = ActivityModule.class) public interface ActivityComponent {

  void inject(SampleActivity activity);
}
