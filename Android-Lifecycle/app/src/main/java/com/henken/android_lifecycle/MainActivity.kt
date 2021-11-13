package com.henken.android_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printToast("Sedang di OnCreate")

        btn_activity.setOnClickListener {
            val intent = Intent(this, LifecycleActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        printToast("Sedang di OnStart")
    }

    override fun onResume() {
        super.onResume()

        printToast("Sedang di OnResume")
    }

    override fun onPause() {
        super.onPause()

        printToast("Sedang di OnPause")
    }

    override fun onStop() {
        super.onStop()
        printToast("Sedang di OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        printToast("Sedang di OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        printToast("Sedang di OnDestroy")
    }

    fun printToast(message : String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}