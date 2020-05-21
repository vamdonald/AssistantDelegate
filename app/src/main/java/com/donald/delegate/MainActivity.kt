package com.donald.delegate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startAssistant()
        finish()
    }

    private fun startAssistant() {
        packageManager.getLaunchIntentForPackage(
            "com.google.android.apps.googleassistant"
        )?.apply {
            addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(this)
        }
    }
}
