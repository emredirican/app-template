package com.emredirican.template.ui.presenter;

import com.emredirican.template.di.graph.PresenterTestComponent;
import org.junit.Before;

public class SamplePresenterTest {

  @Before
  public void setUp() throws Exception {
    PresenterTestComponent.Initializer.init().inject(this);
  }
}