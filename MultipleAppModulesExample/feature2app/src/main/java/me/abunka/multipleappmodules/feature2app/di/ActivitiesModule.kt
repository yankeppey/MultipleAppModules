package me.abunka.multipleappmodules.feature2app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.multipleappmodules.feature2.ActivityE
import me.abunka.multipleappmodules.feature2.ActivityF
import me.abunka.multipleappmodules.feature2app.ActivityD
import me.abunka.multipleappmodules.login.LoginActivity

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    @ActivityScope
    fun provideLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [ActivityDModule::class])
    @ActivityScope
    fun providesMainActivity(): ActivityD


    @ContributesAndroidInjector(modules = [ActivityEModule::class])
    @ActivityScope
    fun provideActivityE(): ActivityE

    @ContributesAndroidInjector
    @ActivityScope
    fun provideActivityF(): ActivityF

}

