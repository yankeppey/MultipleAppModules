package me.abunka.multipleappmodules.di

import dagger.Binds
import dagger.Module
import me.abunka.multipleappmodules.login.LoginNavigation
import me.abunka.multipleappmodules.navigators.MainLoginNavigation

@Module
interface LoginActivityModule {

    @Binds
    fun bindLoginNavigation(mainLoginNavigation: MainLoginNavigation): LoginNavigation
}