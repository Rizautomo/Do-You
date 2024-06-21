package com.bangkit.doyou.ui.career.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.databinding.ActivityCareerPrepUiBinding
import com.bangkit.doyou.ui.profile.ProfileActivity
import com.bangkit.doyou.ui.search.SearchActivity
import com.bangkit.doyou.ui.welcome.MainActivity

class CareerPrepUI : AppCompatActivity() {

    private lateinit var binding : ActivityCareerPrepUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCareerPrepUiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val gender = resources.getStringArray(R.array.gender)

        /*
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_gender, gender)
        binding.dropdownCareer.setAdapter(arrayAdapter)

         */

        // navbar activities
        val goHome: ImageButton = findViewById(R.id.home_btn)
        goHome.setOnClickListener {
            val intentHome = Intent(this@CareerPrepUI, MainActivity::class.java)
            startActivity(intentHome)
        }

        val goProfile : ImageButton = findViewById(R.id.btn_user)
        goProfile.setOnClickListener {
            val intentProfile = Intent(this@CareerPrepUI, ProfileActivity::class.java)
            startActivity(intentProfile)
        }

        val goSearch: ImageButton = findViewById(R.id.search_btn)
        goSearch.setOnClickListener {
            val intentSearch = Intent(this@CareerPrepUI, SearchActivity::class.java)
            startActivity(intentSearch)
        }

        val goCareer: Button = findViewById(R.id.career_input)
        goCareer.setOnClickListener {
            val intentCareerPrepUI = Intent(this@CareerPrepUI, CareerPageActivity::class.java)
            startActivity(intentCareerPrepUI)
            Toast.makeText(this@CareerPrepUI, "Rekomendasi Karir Berhasil didapatkan!", Toast.LENGTH_SHORT).show()
        }
    }
}