package com.emredirican.template;

import android.app.Application;
import butterknife.ButterKnife;
import com.emredirican.template.di.graph.BaseAppComponent;
import com.emredirican.template.di.graph.TemplateAppComponent;
import timber.log.Timber;

public class TemplateApplication extends Application {

  private BaseAppComponent applicationGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    if (this.applicationGraph == null) {
      this.applicationGraph = TemplateAppComponent.Initializer.init(this);
    }
    this.applicationGraph.inject(this);

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
}
