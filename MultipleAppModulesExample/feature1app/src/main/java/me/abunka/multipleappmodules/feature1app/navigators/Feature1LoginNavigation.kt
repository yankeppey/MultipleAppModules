package me.abunka.multipleappmodules.feature1app.navigators

import android.app.Activity
import me.abunka.multipleappmodules.feature1app.ActivityA
import me.abunka.multipleappmodules.feature1app.di.ActivityScope
import me.abunka.multipleappmodules.login.LoginNavigation
import javax.inject.Inject

@ActivityScope
class Feature1LoginNavigation @Inject constructor(): LoginNavigation {
    override fun finishLogin(activity: Activity) {
        activity.startActivity(ActivityA.getIntent(activity))
    }
}