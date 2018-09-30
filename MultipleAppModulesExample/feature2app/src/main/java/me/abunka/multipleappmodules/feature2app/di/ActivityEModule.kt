package me.abunka.multipleappmodules.feature2app.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.feature2.Feature2Navigation
import me.abunka.multipleappmodules.feature2app.navigators.StubFeature2Navigation

@Module
interface ActivityEModule {

    @Binds
    fun bindFeature2Navigation(feature1Navigation: StubFeature2Navigation): Feature2Navigation

}