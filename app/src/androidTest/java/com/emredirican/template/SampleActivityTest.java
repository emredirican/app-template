package com.emredirican.template;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.emredirican.template.di.graph.ActivityTestComponent;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class) public class SampleActivityTest {

  @Rule public ActivityTestRule<SampleActivity> activityTestRule =
      new ActivityTestRule<>(SampleActivity.class, true, false);

  @Before
  public void setUp() throws Exception {

    Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
    TemplateApplication application =
        (TemplateApplication) instrumentation.getTargetContext().getApplicationContext();
    ActivityTestComponent graph = ActivityTestComponent.Initializer.init(application);
    graph.inject(this);
    application.setApplicationGraph(graph);
  }
}