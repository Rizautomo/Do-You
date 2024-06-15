package com.bangkit.doyou.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.profile.ProfileActivity
import com.bangkit.doyou.ui.search.SearchActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //splashScreen
        installSplashScreen()

        //on create
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // for navbar intent
        val goHome: ImageButton = findViewById(R.id.home_btn)
        goHome.setOnClickListener {
            val intentHome = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intentHome)
        }

        val goProfile: ImageButton = findViewById(R.id.btn_user)
        goProfile.setOnClickListener {
            val intentProfile = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intentProfile)
        }

        val goSearch: ImageButton = findViewById(R.id.search_btn)
        goSearch.setOnClickListener {
            val intentSearch = Intent(this@MainActivity, SearchActivity::class.java)
            startActivity(intentSearch)
        }

     }
}