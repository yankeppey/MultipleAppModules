package me.abunka.multipleappmodules.feature1app.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.abunka.multipleappmodules.feature1app.Feature1Application

@Component(modules = [AndroidSupportInjectionModule::class, ActivitiesModule::class])
interface ApplicationComponent: AndroidInjector<Feature1Application> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<Feature1Application>() {

        abstract override fun build(): ApplicationComponent
    }
}

