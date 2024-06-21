package com.bangkit.doyou.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.textclassifier.TextLinks.TextLink
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.career.CareerRecommendation
import com.bangkit.doyou.ui.signup.SignUpActivity
import com.google.firebase.auth.FirebaseAuth
import java.nio.channels.InterruptedByTimeoutException


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginActivity
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        //intent login
        val loginActivity: Button = findViewById(R.id.btn_login)
        loginActivity.setOnClickListener {
            val nextLoginActivity = Intent(this@LoginActivity, CareerRecommendation::class.java)
            startActivity(nextLoginActivity)
            Toast.makeText(this@LoginActivity, "Login Berhasil!", Toast.LENGTH_SHORT).show()
        }

        // firebase system login
       /* auth = FirebaseAuth.getInstance()

        fun login (view: View){
            val email = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            val password = findViewById<EditText>(R.id.editTextTextPassword).text.toString()

            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent = Intent (this@LoginActivity, CareerRecommendation::class.java)
                    startActivity(intent)
                    finish()
            } }.addOnFailureListener { exception ->
                Toast.makeText(applicationContext, exception.localizedMessage, Toast.LENGTH_SHORT).show()
            }
    }

        */
    }
}
