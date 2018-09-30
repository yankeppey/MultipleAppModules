package me.abunka.singleappmodule.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.singleappmodule.login.LoginActivity
import me.abunka.singleappmodule.MainActivity
import me.abunka.singleappmodule.feature1.ActivityB
import me.abunka.singleappmodule.feature1.ActivityC
import me.abunka.singleappmodule.feature2.ActivityE
import me.abunka.singleappmodule.feature2.ActivityF

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector
    @ActivityScope
    fun provideLoginActivity(): LoginActivity

    @ContributesAndroidInjector
    @ActivityScope
    fun providesMainActivity(): MainActivity

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityB(): ActivityB

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityC(): ActivityC

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityE(): ActivityE

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityF(): ActivityF
}