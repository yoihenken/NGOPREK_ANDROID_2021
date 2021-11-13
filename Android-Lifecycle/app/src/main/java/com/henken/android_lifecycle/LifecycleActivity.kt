package com.henken.android_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        printToast("Sedang di OnCreate Halaman 2")
    }

    override fun onStart() {
        super.onStart()

        printToast("Sedang di OnStart Halaman 2")
    }

    override fun onResume() {
        super.onResume()

        printToast("Sedang di OnResume Halaman 2")
    }

    override fun onPause() {
        super.onPause()

        printToast("Sedang di OnPause Halaman 2")
    }

    override fun onStop() {
        super.onStop()
        printToast("Sedang di OnStop Halaman 2")
    }

    override fun onRestart() {
        super.onRestart()
        printToast("Sedang di OnRestart Halaman 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        printToast("Sedang di OnDestroy Halaman 2")
    }

    fun printToast(message : String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}