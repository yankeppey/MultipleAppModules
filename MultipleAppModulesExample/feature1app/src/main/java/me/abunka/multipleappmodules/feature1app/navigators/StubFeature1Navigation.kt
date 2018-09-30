package me.abunka.multipleappmodules.feature1app.navigators

import android.app.Activity
import android.support.v7.app.AlertDialog
import me.abunka.multipleappmodules.feature1app.di.ActivityScope
import me.abunka.multipleappmodules.feature1.Feature1Navigation
import javax.inject.Inject

@ActivityScope
class StubFeature1Navigation @Inject constructor() : Feature1Navigation {
    override fun goToF(activity: Activity) {
        AlertDialog.Builder(activity).setMessage("Not implemented!").show()
    }

}