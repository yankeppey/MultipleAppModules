package me.abunka.multipleappmodules.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.multipleappmodules.login.LoginActivity
import me.abunka.multipleappmodules.MainActivity
import me.abunka.multipleappmodules.feature1.ActivityB
import me.abunka.multipleappmodules.feature1.ActivityC
import me.abunka.multipleappmodules.feature2.ActivityE
import me.abunka.multipleappmodules.feature2.ActivityF

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    @ActivityScope
    fun provideLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @ActivityScope
    fun providesMainActivity(): MainActivity

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityB(): ActivityB

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityC(): ActivityC

    @ContributesAndroidInjector(modules = [ActivityEModule::class])
    @ActivityScope
    fun provideActivityE(): ActivityE

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityF(): ActivityF
}

