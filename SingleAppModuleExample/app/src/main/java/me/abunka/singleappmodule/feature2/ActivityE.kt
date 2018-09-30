package me.abunka.singleappmodule.feature2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_e.*
import me.abunka.singleappmodule.R
import me.abunka.singleappmodule.feature1.ActivityC

class ActivityE: DaggerAppCompatActivity() {
    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityE::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
        goToC.setOnClickListener { startActivity(ActivityC.getIntent(this)) }
        goToF.setOnClickListener { startActivity(ActivityF.getIntent(this)) }
    }
}