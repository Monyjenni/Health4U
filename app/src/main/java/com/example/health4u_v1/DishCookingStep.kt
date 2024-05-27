package com.example.health4u_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.net.Uri

class DishCookingStep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_cook_step)
    }
    fun navigateBackToDashboard(view: View) {
        val intent = Intent(this, dashboard_screen::class.java)
        startActivity(intent)
    }


    fun openYouTubeVideo(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bda-65jMFC8"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.putExtra("force_fullscreen", true)
        startActivity(intent)
    }
}