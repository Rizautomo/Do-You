package com.bangkit.doyou.ui.profile

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
import com.bangkit.doyou.ui.study.StudyPrep
import com.bangkit.doyou.ui.study.StudyRecommendation

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        // button intent moving to other activities
        val goCareer: Button = findViewById(R.id.btn_career)
        goCareer.setOnClickListener {
            val intentCareer = Intent(this@ProfileActivity, CareerPrepUI::class.java)
            startActivity(intentCareer)
        }

        val goStudy: Button = findViewById(R.id.btn_study)
        goStudy.setOnClickListener {
            val intentStudy = Intent(this@ProfileActivity, StudyPrep::class.java)
            startActivity(intentStudy)
        }
    }
}