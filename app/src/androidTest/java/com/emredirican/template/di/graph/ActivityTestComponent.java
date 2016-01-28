package com.emredirican.template.di.graph;

import com.emredirican.template.LoginActivityTest;
import com.emredirican.template.SampleActivityTest;
import com.emredirican.template.TemplateApplication;
import com.emredirican.template.di.module.ActivityTestUtilityModule;
import com.emredirican.template.di.module.DebugTestBaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = {
    DebugTestBaseModule.class, ActivityTestUtilityModule.class
}) public interface ActivityTestComponent extends TemplateAppComponent {

  void inject(SampleActivityTest test);

  final class Initializer {
    public static ActivityTestComponent init(TemplateApplication application) {
      return DaggerActivityTestComponent.builder()
          .debugTestBaseModule(new DebugTestBaseModule(application))
          .build();
    }

    private Initializer() {
    }
  }
}
