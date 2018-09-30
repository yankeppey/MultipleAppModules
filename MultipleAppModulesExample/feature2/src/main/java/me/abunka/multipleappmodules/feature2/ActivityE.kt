package me.abunka.multipleappmodules.feature2

import android.content.Context
import android.content.Intent
import kotlinx.android.synthetic.main.activity_e.*
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class ActivityE: DaggerAppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, ActivityE::class.java)
    }

    @Inject
    lateinit var navigation: Feature2Navigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
        goToC.setOnClickListener { navigation.goToC(this) }
        goToF.setOnClickListener { startActivity(ActivityF.getIntent(this)) }
    }
}

