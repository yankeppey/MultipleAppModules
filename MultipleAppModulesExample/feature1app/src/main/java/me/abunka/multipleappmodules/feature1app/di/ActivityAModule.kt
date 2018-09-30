package me.abunka.multipleappmodules.feature1app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.multipleappmodules.feature1.FragmentA

@Module
interface ActivityAModule {

    @ContributesAndroidInjector(modules = [FragmentAModule::class])
    @FragmentScope
    fun provideFragmentA(): FragmentA

}