package com.emredirican.template.di.module;

import android.os.AsyncTask;
import com.emredirican.template.di.Names;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


@Module public class UtilityModule {

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
