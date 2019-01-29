package com.emredirican.template.di.graph

import com.emredirican.template.SampleActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

interface SampleActivityComponent : AndroidInjector<SampleActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SampleActivity>()
}