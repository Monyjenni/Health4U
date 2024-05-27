package com.example.health4u_v1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class dashboard_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_screen)
    }

    fun onWorkoutPlansClicked(view: View) {
        val intent = Intent(this, workout_page1::class.java)
        startActivity(intent)
    }

    fun onDietPlansClicked(view: View) {
        val intent = Intent(this, DishPreview::class.java)
        startActivity(intent)
    }
    fun onPfSetting(view: View) {
        val intent = Intent(this, activity_setting::class.java)
        startActivity(intent)
    }
}
