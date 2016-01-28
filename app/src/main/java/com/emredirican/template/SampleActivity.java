package com.emredirican.template;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class SampleActivity extends InjectableAppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample);
    getObjectGraph().inject(this);
  }
}
