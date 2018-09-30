package me.abunka.multipleappmodules.feature2app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.abunka.multipleappmodules.feature2app.di.DaggerApplicationComponent

class Feature2Application : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<Feature2Application> =
            DaggerApplicationComponent
                    .builder()
                    .create(this)

}