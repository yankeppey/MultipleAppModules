package me.abunka.multipleappmodules.feature2app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class ActivityD: DaggerAppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityD::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }
}