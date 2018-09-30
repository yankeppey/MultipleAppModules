package me.abunka.multipleappmodules.feature1app.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.login.LoginNavigation
import me.abunka.multipleappmodules.feature1app.navigators.Feature1LoginNavigation

@Module
interface LoginActivityModule {

    @Binds
    fun bindLoginNavigation(mainLoginNavigation: Feature1LoginNavigation): LoginNavigation
}