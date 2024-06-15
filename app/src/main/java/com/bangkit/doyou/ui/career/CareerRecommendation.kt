package com.bangkit.doyou.ui.career

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.study.StudyRecommendation

class CareerRecommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career_recommendation)


        val nextStudy: Button = findViewById(R.id.career_skipped)
        nextStudy.setOnClickListener {
            val intentStudy = Intent(this@CareerRecommendation, StudyRecommendation::class.java)
            startActivity(intentStudy)
        }
    }
}