package me.abunka.multipleappmodules.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.feature2.Feature2Navigation
import me.abunka.multipleappmodules.navigators.MainFeature2Navigation

@Module
interface ActivityEModule {

    @Binds
    fun bindFeature2Navigation(feature2Navigation: MainFeature2Navigation): Feature2Navigation

}