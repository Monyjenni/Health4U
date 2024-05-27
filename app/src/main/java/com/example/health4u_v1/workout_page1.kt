package com.example.health4u_v1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class workout_page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_page1)
    }

    fun navigateToWorkoutPreview(view: View) {
        val intent = Intent(this, workout_preview::class.java)
        startActivity(intent)
    }


}