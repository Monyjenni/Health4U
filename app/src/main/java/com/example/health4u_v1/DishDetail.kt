package com.example.health4u_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DishDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cook_detail)
    }

    fun navigateToCookStep(view: View) {
        val intent = Intent(this, DishCookingStep::class.java)
        startActivity(intent)
    }
}