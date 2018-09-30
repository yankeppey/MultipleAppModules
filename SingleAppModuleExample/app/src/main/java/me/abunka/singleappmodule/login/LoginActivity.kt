package me.abunka.singleappmodule.login

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import me.abunka.singleappmodule.MainActivity
import me.abunka.singleappmodule.R

class LoginActivity: DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener { startActivity(MainActivity.getIntent(this)) }
    }

}