package com.bangkit.doyou.ui.splashScreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.doyou.ui.welcome.MainActivity
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.career.CareerRecommendation
import com.bangkit.doyou.ui.login.LoginActivity

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashScreen, LoginActivity::class.java))
            finish()
        }, 1000)
     }
    }
