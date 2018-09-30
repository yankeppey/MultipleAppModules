package me.abunka.multipleappmodules.feature1app.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.feature1.Feature1Navigation
import me.abunka.multipleappmodules.feature1app.navigators.StubFeature1Navigation

@Module
interface FragmentAModule {

    @Binds
    fun bindFeature1Navigation(feature1Navigation: StubFeature1Navigation): Feature1Navigation

}