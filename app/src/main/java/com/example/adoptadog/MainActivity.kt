package com.example.adoptadog

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firebaseAnalytics = FirebaseAnalytics.getInstance(this)

        val loginButton: Button = findViewById(R.id.login)
        loginButton.setOnClickListener {

            firebaseAnalytics.logEvent("login_button_click", null)
        }
    }
}
