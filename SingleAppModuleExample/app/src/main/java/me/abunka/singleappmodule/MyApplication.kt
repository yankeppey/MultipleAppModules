package me.abunka.singleappmodule

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.abunka.singleappmodule.di.DaggerApplicationComponent

class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<MyApplication> =
            DaggerApplicationComponent
                    .builder()
                    .create(this)

}