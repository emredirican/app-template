package com.emredirican.template.di.module;

import com.emredirican.template.TemplateApplication;
import com.squareup.leakcanary.RefWatcher;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class DebugTestBaseModule {

  private final TemplateApplication application;

  public DebugTestBaseModule(TemplateApplication application) {
    this.application = application;
  }

  @Provides
  @Singleton
  public TemplateApplication provideApplicationContext() {
    return application;
  }

  @Provides
  @Singleton
  public RefWatcher provideRefWatcher() {
    return RefWatcher.DISABLED;
  }
}
