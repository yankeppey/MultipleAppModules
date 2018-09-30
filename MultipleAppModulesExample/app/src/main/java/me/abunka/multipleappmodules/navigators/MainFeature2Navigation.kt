package me.abunka.multipleappmodules.navigators

import android.app.Activity
import me.abunka.multipleappmodules.di.ActivityScope
import me.abunka.multipleappmodules.feature1.ActivityC
import me.abunka.multipleappmodules.feature2.Feature2Navigation
import javax.inject.Inject

@ActivityScope
class MainFeature2Navigation @Inject constructor(): Feature2Navigation{
    override fun goToC(activity: Activity) {
        activity.startActivity(ActivityC.getIntent(activity))
    }

}