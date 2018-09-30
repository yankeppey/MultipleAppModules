package me.abunka.multipleappmodules.feature2app.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.feature2app.navigators.Feature2LoginNavigation
import me.abunka.multipleappmodules.login.LoginNavigation

@Module
interface LoginActivityModule {

    @Binds
    fun bindLoginNavigation(mainLoginNavigation: Feature2LoginNavigation): LoginNavigation
}