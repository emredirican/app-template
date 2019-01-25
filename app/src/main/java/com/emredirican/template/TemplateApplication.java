package com.emredirican.template;

import android.app.Activity;
import android.app.Application;
import butterknife.ButterKnife;
import com.emredirican.template.di.graph.BaseAppComponent;
import com.emredirican.template.di.graph.DaggerTemplateAppComponent;
import com.emredirican.template.di.graph.TemplateAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import timber.log.Timber;

//Assuming we cannot extend from DaggerApplication
public class TemplateApplication extends Application implements HasActivityInjector {

  private BaseAppComponent applicationGraph;

  @Inject
  DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerTemplateAppComponent.create().inject(this);

    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    }
    ButterKnife.setDebug(BuildConfig.DEBUG);
  }

  public BaseAppComponent getApplicationGraph() {
    return applicationGraph;
  }

  public void setApplicationGraph(BaseAppComponent applicationGraph) {
    this.applicationGraph = applicationGraph;
  }

  @Override
  public AndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }
}
