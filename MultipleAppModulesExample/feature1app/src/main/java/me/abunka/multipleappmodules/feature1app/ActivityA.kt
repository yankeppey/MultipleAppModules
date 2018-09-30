package me.abunka.multipleappmodules.feature1app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class ActivityA: DaggerAppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityA::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }
}