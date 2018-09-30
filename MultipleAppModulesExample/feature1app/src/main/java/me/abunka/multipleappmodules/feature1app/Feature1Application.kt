package me.abunka.multipleappmodules.feature1app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.abunka.multipleappmodules.feature1app.di.DaggerApplicationComponent

class Feature1Application: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<Feature1Application> =
            DaggerApplicationComponent
                    .builder()
                    .create(this)

}