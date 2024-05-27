package com.example.health4u_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DishCookingStep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_cook_step)
    }
    fun navigateBackToDashboard(view: View) {
        val intent = Intent(this, dashboard_screen::class.java)
        startActivity(intent)
    }
}