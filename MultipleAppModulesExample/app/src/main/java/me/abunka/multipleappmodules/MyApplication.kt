package me.abunka.multipleappmodules

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.abunka.multipleappmodules.di.DaggerApplicationComponent

class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<MyApplication> =
            DaggerApplicationComponent
                    .builder()
                    .create(this)

}