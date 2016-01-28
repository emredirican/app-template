package com.emredirican.template.di.module;

import com.emredirican.template.di.Names;
import com.squareup.otto.Bus;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import org.mockito.Mockito;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

@Module public class ActivityTestUtilityModule {

  @Provides
  @Singleton
  public Bus provideBus() {
    return Mockito.mock(Bus.class);
  }

  @Provides
  @Singleton
  @Named(Names.SCHEDULER_MAIN)
  public Scheduler provideScheduler() {
    return AndroidSchedulers.mainThread();
  }

  @Provides
  @Singleton
  @Named(Names.SCHEDULER_WORKER)
  public Scheduler provideWorkerScheduler() {
    return AndroidSchedulers.mainThread();
  }
}
