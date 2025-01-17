package com.example.dogadoptionapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title: TextView = findViewById(R.id.titleTextView)
        val loginButton: Button = findViewById(R.id.loginButton)
        val profileButton: Button = findViewById(R.id.profileButton)

        // Title setup
        title.text = "Dogs Available for Adoption"

        // Login button setup
        loginButton.setOnClickListener {
            showLoginDialog()
        }

        // Navigate to Profile Activity
        profileButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showLoginDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Login/Sign Up")

        // Inflate custom dialog layout
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_login, null)
        builder.setView(dialogView)

        builder.setPositiveButton("Login") { _, _ ->
            Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton("Cancel") { dialog, _ ->
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()
    }
}