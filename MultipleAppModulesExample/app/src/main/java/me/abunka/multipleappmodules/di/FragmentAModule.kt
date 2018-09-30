package me.abunka.multipleappmodules.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.feature1.Feature1Navigation
import me.abunka.multipleappmodules.navigators.MainFeature1Navigation

@Module
interface FragmentAModule {

    @Binds
    fun bindFeature1Navigation(feature1Navigation: MainFeature1Navigation): Feature1Navigation

}