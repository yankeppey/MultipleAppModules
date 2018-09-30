package me.abunka.multipleappmodules.feature2app.navigators

import android.app.Activity
import me.abunka.multipleappmodules.feature2app.ActivityD
import me.abunka.multipleappmodules.feature2app.di.ActivityScope
import me.abunka.multipleappmodules.login.LoginNavigation
import javax.inject.Inject

@ActivityScope
class Feature2LoginNavigation @Inject constructor(): LoginNavigation {
    override fun finishLogin(activity: Activity) {
        activity.startActivity(ActivityD.getIntent(activity))
    }
}