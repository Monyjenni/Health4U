package com.example.health4u_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
class workout_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_detail)
    }

    private fun navigateBackToWorkoutPreview(view: View) {
        val intent = Intent(this, DishPreview::class.java)
        startActivity(intent)
    }
}