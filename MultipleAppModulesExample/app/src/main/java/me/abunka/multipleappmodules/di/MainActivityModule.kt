package me.abunka.multipleappmodules.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.multipleappmodules.feature1.FragmentA

@Module
interface MainActivityModule {

    @ContributesAndroidInjector(modules = [FragmentAModule::class])
    @FragmentScope
    fun provideFragmentA(): FragmentA

}