package com.kudi.test.routinechecks.dagger.activities

import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kudi.test.routinechecks.R
import com.kudi.test.routinechecks.dagger.fragments.NextUpFragment
import com.kudi.test.routinechecks.dagger.fragments.RoutinesFragment
import com.kudi.test.routinechecks.dagger.fragments.SettingsFragment
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    var toolbar: Toolbar ?= null

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector() = dispatchingAndroidInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.main_toolbar)
        setSupportActionBar(toolbar)

        val bottomNavigationView: BottomNavigationView  = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        bottomNavigationView.selectedItemId = R.id.action_routines
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.action_routines ->{
                toolbar?.title = "Routines"
                Toast.makeText(this.applicationContext, "ROUTINES", Toast.LENGTH_LONG).show()
                val routines = RoutinesFragment()
                openFragment(routines)
                return true
            }

            R.id.action_settings ->{
                toolbar?.title = "Settings"
                val settings = SettingsFragment()
                openFragment(settings)
                Toast.makeText(this.applicationContext, "SETTINGS", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.action_next_up -> {
                toolbar?.title = "Next Up"
                Toast.makeText(this.applicationContext, "NEXT UP", Toast.LENGTH_LONG).show()
                val nextUp = NextUpFragment()
                openFragment(nextUp)
                return true
            }else -> {
            toolbar?.title = "Routines"
            Toast.makeText(this.applicationContext, "ROUTINES", Toast.LENGTH_LONG).show()
            val routines = RoutinesFragment()
            openFragment(routines)
            return true
        }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> {
                if (supportFragmentManager.backStackEntryCount > 0) {
                    fragmentManager.popBackStack()
                    //true
                }
                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_frame_layout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
