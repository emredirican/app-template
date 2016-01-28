package com.emredirican.template.di.graph;

import com.emredirican.template.TemplateApplication;
import com.emredirican.template.di.module.ActivityTestUtilityModule;
import com.emredirican.template.di.module.DebugTestBaseModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = {
    DebugTestBaseModule.class, ActivityTestUtilityModule.class
}) public interface TemplateAppComponent extends BaseAppComponent {

  final class Initializer {
    public static BaseAppComponent init(TemplateApplication application) {
      return DaggerTemplateAppComponent.builder()
          .debugTestBaseModule(new DebugTestBaseModule(application))
          .build();
    }

    private Initializer() {
    }
  }
}
