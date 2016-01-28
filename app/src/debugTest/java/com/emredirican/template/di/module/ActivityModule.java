package com.emredirican.template.di.module;

import android.app.Activity;
import com.emredirican.template.di.graph.PerActivity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.StubPicasso;
import dagger.Module;
import dagger.Provides;

@Module public class ActivityModule {

  private final Activity activity;

  public ActivityModule(Activity activity) {
    this.activity = activity;
  }

  @Provides
  @PerActivity
  public Activity provideActivityContext() {
    return activity;
  }

  @Provides
  @PerActivity
  public Picasso providePicasso() {
    return StubPicasso.init(activity);
  }

}

