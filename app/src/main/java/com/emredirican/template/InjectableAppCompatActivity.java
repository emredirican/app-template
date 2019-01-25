package com.emredirican.template;

import androidx.appcompat.app.AppCompatActivity;
import com.emredirican.template.di.graph.ActivityComponent;
import com.emredirican.template.di.module.ActivityModule;

public class InjectableAppCompatActivity extends AppCompatActivity {

  private ActivityComponent objectGraph;

  public ActivityComponent getObjectGraph() {
    if (objectGraph == null) {
      objectGraph = getTemplateApplication().getApplicationGraph().plus(new ActivityModule(this));
    }
    return objectGraph;
  }

  public TemplateApplication getTemplateApplication() {
    return (TemplateApplication) getApplication();
  }
}
