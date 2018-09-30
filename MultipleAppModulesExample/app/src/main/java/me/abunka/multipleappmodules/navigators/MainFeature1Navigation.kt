package me.abunka.multipleappmodules.navigators

import android.app.Activity
import me.abunka.multipleappmodules.di.ActivityScope
import me.abunka.multipleappmodules.feature1.Feature1Navigation
import me.abunka.multipleappmodules.feature2.ActivityF
import javax.inject.Inject

@ActivityScope
class MainFeature1Navigation @Inject constructor(): Feature1Navigation {
    override fun goToF(activity: Activity) {
        activity.startActivity(ActivityF.getIntent(activity))
    }

}