package com.bangkit.doyou.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.login.LoginActivity
import com.bangkit.doyou.ui.signup.SignUpActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        //intent
        val goLogin: Button = findViewById(R.id.to_login)
        goLogin.setOnClickListener {
            val intentLogin = Intent (this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intentLogin)
        }

        val goSignup: Button = findViewById(R.id.to_signup)
        goSignup.setOnClickListener {
            val intentSignUp = Intent (this@WelcomeActivity, SignUpActivity::class.java)
            startActivity(intentSignUp)
        }

        }
   }