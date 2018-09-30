package me.abunka.multipleappmodules.feature2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class ActivityF: DaggerAppCompatActivity() {
    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityF::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)
    }
}