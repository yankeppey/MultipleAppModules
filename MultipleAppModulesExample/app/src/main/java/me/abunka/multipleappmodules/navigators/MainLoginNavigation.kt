package me.abunka.multipleappmodules.navigators

import android.app.Activity
import me.abunka.multipleappmodules.MainActivity
import me.abunka.multipleappmodules.di.ActivityScope
import me.abunka.multipleappmodules.login.LoginNavigation
import javax.inject.Inject

@ActivityScope
class MainLoginNavigation @Inject constructor(): LoginNavigation {
    override fun finishLogin(activity: Activity) {
        activity.startActivity(MainActivity.getIntent(activity))
    }
}