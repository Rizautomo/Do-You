package com.bangkit.doyou.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.textclassifier.TextLinks.TextLink
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.career.CareerRecommendation
import java.nio.channels.InterruptedByTimeoutException


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //login
        val loginActivity: Button = findViewById(R.id.btn_login)
        loginActivity.setOnClickListener {
            val nextLoginActivity = Intent(this@LoginActivity, CareerRecommendation::class.java)
            startActivity(nextLoginActivity)
        }
    }
}
