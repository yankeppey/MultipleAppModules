package me.abunka.multipleappmodules.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.abunka.multipleappmodules.MyApplication

@Component(modules = [AndroidSupportInjectionModule::class, ActivitiesModule::class])
interface ApplicationComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>() {

        abstract override fun build(): ApplicationComponent
    }
}

