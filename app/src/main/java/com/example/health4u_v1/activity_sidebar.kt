package com.example.health4u_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_sidebar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sidebar)
    }
    fun userSetting(view: View) {
        val intent = Intent(this, dashboard_screen::class.java)
        startActivity(intent)
    }
    fun navigateToBMI(view: View) {
        val intent = Intent(this, bmi_result::class.java)
        startActivity(intent)
    }
}