package com.bangkit.doyou.ui.study

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.profile.ProfileActivity
import com.bangkit.doyou.ui.search.SearchActivity
import com.bangkit.doyou.ui.welcome.MainActivity

class StudyPrep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_study_prep)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val goHome: ImageButton = findViewById(R.id.home_btn)
        goHome.setOnClickListener {
            val intentHome = Intent(this@StudyPrep, MainActivity::class.java)
            startActivity(intentHome)
        }

        val goProfile: ImageButton = findViewById(R.id.btn_user)
        goProfile.setOnClickListener {
            val intentProfile = Intent(this@StudyPrep, ProfileActivity::class.java)
            startActivity(intentProfile)
        }

        val goSearch: ImageButton = findViewById(R.id.search_btn)
        goSearch.setOnClickListener {
            val intentSearch = Intent(this@StudyPrep, SearchActivity::class.java)
            startActivity(intentSearch)
        }
    }
}