package com.bangkit.doyou.ui.signup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.doyou.R
import com.bangkit.doyou.ui.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        // intent
        val goLogin: Button = findViewById(R.id.btn_reg)
        goLogin.setOnClickListener {
            val intentLogin = Intent(this@SignUpActivity, LoginActivity::class.java)
            startActivity(intentLogin)
            Toast.makeText(this@SignUpActivity, "Pendaftaran Berhasil!", Toast.LENGTH_SHORT).show()
        }

        /*
        // firebase signup
        auth = FirebaseAuth.getInstance()

        val nama = findViewById<EditText>(R.id.reg_nama).text.toString()
        val email = findViewById<EditText>(R.id.reg_email).text.toString()
        val password = findViewById<EditText>(R.id.reg_pass).text.toString()
        val rePassword = findViewById<EditText>(R.id.reg_re_pass).text.toString()

        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if(task.isSuccessful) {
                val intent = Intent(this@SignUpActivity, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.addOnFailureListener { exception ->
            Toast.makeText(applicationContext,exception.localizedMessage,Toast.LENGTH_SHORT).show()
        }

         */

    }
}