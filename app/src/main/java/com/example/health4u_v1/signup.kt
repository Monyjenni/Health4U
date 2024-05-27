package com.example.health4u_v1

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    private lateinit var emailInput: EditText
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var confirmPasswordInput: EditText
    private lateinit var signUpButton: Button
    private lateinit var loginNowTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        emailInput = findViewById(R.id.email_input)
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        confirmPasswordInput = findViewById(R.id.confirm_password_input)
        signUpButton = findViewById(R.id.sign_up)
        loginNowTextView = findViewById(R.id.login_now)  // Correct ID reference

        signUpButton.setOnClickListener {
            handleSignUp()
        }
        
        loginNowTextView.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun handleSignUp() {
        val email = emailInput.text.toString().trim()
        val username = usernameInput.text.toString().trim()
        val password = passwordInput.text.toString().trim()
        val confirmPassword = confirmPasswordInput.text.toString().trim()

        if (validateInput(email, username, password, confirmPassword)) {
            Toast.makeText(this, "Sign-up successful!", Toast.LENGTH_LONG).show()
        }
    }

    private fun validateInput(email: String, username: String, password: String, confirmPassword: String): Boolean {
        if (email.isEmpty()) {
            emailInput.error = "Email is required"
            emailInput.requestFocus()
            return false
        }

        if (username.isEmpty()) {
            usernameInput.error = "Username is required"
            usernameInput.requestFocus()
            return false
        }

        if (password.isEmpty()) {
            passwordInput.error = "Password is required"
            passwordInput.requestFocus()
            return false
        }

        if (confirmPassword.isEmpty()) {
            confirmPasswordInput.error = "Confirm Password is required"
            confirmPasswordInput.requestFocus()
            return false
        }

        if (password != confirmPassword) {
            confirmPasswordInput.error = "Passwords do not match"
            confirmPasswordInput.requestFocus()
            return false
        }

        if (password.length < 6) {
            passwordInput.error = "Password must be at least 6 characters long"
            passwordInput.requestFocus()
            return false
        }

        return true
    }
}
