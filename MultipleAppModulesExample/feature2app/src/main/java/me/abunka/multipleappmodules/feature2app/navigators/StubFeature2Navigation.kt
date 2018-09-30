package me.abunka.multipleappmodules.feature2app.navigators

import android.app.Activity
import android.support.v7.app.AlertDialog
import me.abunka.multipleappmodules.feature2.Feature2Navigation
import me.abunka.multipleappmodules.feature2app.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class StubFeature2Navigation @Inject constructor() : Feature2Navigation {
    override fun goToC(activity: Activity) {
        AlertDialog.Builder(activity).setMessage("Not implemented!").show()
    }

}