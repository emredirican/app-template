package com.emredirican.template.di.module;

import com.emredirican.template.di.Names;
import com.squareup.otto.Bus;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import org.mockito.Mockito;
import rx.Scheduler;
import rx.schedulers.Schedulers;

@Module public class UnitTestUtilityModule {

  @Provides
  @Singleton
  public Bus provideBus() {
    return Mockito.mock(Bus.class);
  }

  @Provides
  @Singleton
  @Named(Names.SCHEDULER_MAIN)
  public Scheduler provideRxScheduler() {
    return Schedulers.immediate();
  }

  @Provides
  @Singleton
  @Named(Names.SCHEDULER_WORKER)
  public Scheduler provideRxSchedulerWorker() {
    return Schedulers.immediate();
  }

  @Provides
  @Singleton
  public Picasso providePicasso() {
    return Mockito.mock(Picasso.class);
  }
}
