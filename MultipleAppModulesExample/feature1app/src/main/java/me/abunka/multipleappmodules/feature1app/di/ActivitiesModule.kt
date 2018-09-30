package me.abunka.multipleappmodules.feature1app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.multipleappmodules.feature1app.ActivityA
import me.abunka.multipleappmodules.feature1.ActivityB
import me.abunka.multipleappmodules.feature1.ActivityC
import me.abunka.multipleappmodules.login.LoginActivity

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    @ActivityScope
    fun provideLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [ActivityAModule::class])
    @ActivityScope
    fun providesMainActivity(): ActivityA

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityB(): ActivityB

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityC(): ActivityC

}

