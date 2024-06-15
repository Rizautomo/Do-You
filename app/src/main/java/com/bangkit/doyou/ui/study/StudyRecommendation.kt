package com.bangkit.doyou.ui.study

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.career.ui.CareerPrepUI
import com.bangkit.doyou.ui.profile.ProfileActivity
import com.bangkit.doyou.ui.welcome.MainActivity

class StudyRecommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_study_recommendation)

        val goMain : Button = findViewById(R.id.study_skipped)
        goMain.setOnClickListener {
            val intentMain = Intent(this@StudyRecommendation, MainActivity::class.java)
            startActivity(intentMain)
        }

    }
}