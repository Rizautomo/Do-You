package com.bangkit.doyou.ui.career.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.profile.ProfileActivity
import com.bangkit.doyou.ui.search.SearchActivity
import com.bangkit.doyou.ui.study.StudyPrep
import com.bangkit.doyou.ui.study.StudyRecommendation
import com.bangkit.doyou.ui.welcome.MainActivity

class CareerPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_career_page)

        val goHome: ImageButton = findViewById(R.id.home_btn)
        goHome.setOnClickListener {
            val intentHome = Intent(this@CareerPageActivity, MainActivity::class.java)
            startActivity(intentHome)
        }

        val goProfile: ImageButton = findViewById(R.id.btn_user)
        goProfile.setOnClickListener {
            val intentProfile = Intent(this@CareerPageActivity, ProfileActivity::class.java)
            startActivity(intentProfile)
        }

        val goSearch: ImageButton = findViewById(R.id.search_btn)
        goSearch.setOnClickListener {
            val intentSearch = Intent(this@CareerPageActivity, SearchActivity::class.java)
            startActivity(intentSearch)
        }

        val goStudy: Button = findViewById<Button>(R.id.intent_studi)
        goStudy.setOnClickListener {
            val intentStudy = Intent(this@CareerPageActivity, StudyPrep::class.java)
            startActivity(intentStudy)
        }
    }
}