package com.emredirican.template.di.module;

import android.os.AsyncTask;
import com.emredirican.template.di.Names;
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

@Module public class UtilityModule {

  @Provides
  @Singleton
  public Bus provideBus() {
    return new Bus(ThreadEnforcer.MAIN);
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
    return Schedulers.from(AsyncTask.THREAD_POOL_EXECUTOR);
  }

}
