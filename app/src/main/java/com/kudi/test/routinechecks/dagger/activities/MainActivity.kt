package com.kudi.test.routinechecks.dagger.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kudi.test.routinechecks.R

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView  = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        bottomNavigationView.setBackgroundColor(Color.GRAY)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(p0.itemId){
            R.id.action_routines ->{
                Toast.makeText(this.applicationContext, "ROUTINES", Toast.LENGTH_LONG).show()
                true
            }

            R.id.action_settings ->{
                Toast.makeText(this.applicationContext, "SETTINGS", Toast.LENGTH_LONG).show()
                true
            }

            R.id.action_next_up -> {
                Toast.makeText(this.applicationContext, "NEXT UP", Toast.LENGTH_LONG).show()
                true
            }else -> false
        }

    }

}
