package com.emredirican.template.di.graph;

import com.emredirican.template.TemplateApplication;
import com.emredirican.template.di.module.ActivityModule;

public interface BaseAppComponent {
  ActivityComponent plus(ActivityModule activityModule);

  void inject(TemplateApplication application);
}
