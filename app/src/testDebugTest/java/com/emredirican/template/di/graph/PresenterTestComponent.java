package com.emredirican.template.di.graph;

import com.emredirican.template.di.module.UnitTestUtilityModule;
import com.emredirican.template.ui.presenter.SamplePresenterTest;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = {
    UnitTestUtilityModule.class
}) public interface PresenterTestComponent {

  void inject(SamplePresenterTest test);


  final class Initializer {
    public static PresenterTestComponent init() {
      return DaggerPresenterTestComponent.builder().build();
    }

    private Initializer() {
    }
  }
}
