package me.abunka.multipleappmodules.feature2app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.abunka.multipleappmodules.feature2.FragmentD

@Module
interface ActivityDModule {

    @ContributesAndroidInjector
    @FragmentScope
    fun provideFragmentA(): FragmentD

}