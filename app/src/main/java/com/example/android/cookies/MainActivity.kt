package com.example.android.cookies

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Called when the cookie should be eaten.
     */
    fun eatCookie(view: View?) {
        // Find a reference to the ImageView in the layout. Change the image.
        val imageView = findViewById<ImageView>(R.id.android_cookie_image_view)
        imageView.setImageResource(R.drawable.after_cookie)

        // Find a reference to the TextView in the layout. Change the text.
        val textView = findViewById<TextView>(R.id.status_text_view)
        textView.text = "I'm so full"
    }
}