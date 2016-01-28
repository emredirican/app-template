package com.emredirican.template.di.graph;

import com.emredirican.template.TemplateApplication;
import com.emredirican.template.di.module.BaseModule;
import com.emredirican.template.di.module.UtilityModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = {
    BaseModule.class, UtilityModule.class
}) public interface TemplateAppComponent extends BaseAppComponent {

  final class Initializer {
    public static BaseAppComponent init(TemplateApplication application) {
      return DaggerTemplateAppComponent.builder().baseModule(new BaseModule(application)).build();
    }

    private Initializer() {
    }
  }
}
