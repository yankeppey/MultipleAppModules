package me.abunka.multipleappmodules

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import me.abunka.multipleappmodules.feature1.FragmentA
import me.abunka.multipleappmodules.feature2.FragmentD

class MainActivity : DaggerAppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    private fun replaceFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.homeContent, fragment)
    }.commitAllowingStateLoss()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        replaceFragment(when (item.itemId) {
            R.id.navigation_home -> MainFragment.newInstance()
            R.id.navigation_dashboard -> FragmentA.newInstance()
            R.id.navigation_notifications -> FragmentD.newInstance()
            else -> throw UnsupportedOperationException("Unknown tab!")
        })

        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(MainFragment.newInstance())
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
