package com.emredirican.template;

import android.os.Bundle;

import androidx.annotation.Nullable;
import dagger.android.AndroidInjection;

public class SampleActivity extends InjectableAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
}
