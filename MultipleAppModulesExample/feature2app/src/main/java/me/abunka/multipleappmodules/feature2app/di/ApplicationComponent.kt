package me.abunka.multipleappmodules.feature2app.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.abunka.multipleappmodules.feature2app.Feature2Application

@Component(modules = [AndroidSupportInjectionModule::class, ActivitiesModule::class])
interface ApplicationComponent: AndroidInjector<Feature2Application> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<Feature2Application>() {

        abstract override fun build(): ApplicationComponent
    }
}

