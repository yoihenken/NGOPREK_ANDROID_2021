package com.henken.uiandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.henken.uiandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvHome.size = getAds().size
        binding.cvHome.setCarouselViewListener { view, position ->
            val carouselImage = view.findViewById<ImageView>(R.id.iv_carousel)
            carouselImage.load(getAds()[position])
        }
        binding.cvHome.show()

        binding.btnSubmit.setOnClickListener {
            val name : String = binding.tieNama.text.toString()
            val nim : String = binding.tieNim.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_NAME, name)
            intent.putExtra(DetailActivity.EXTRA_NIM, nim)
            startActivity(intent)
        }

    }

    fun getAds(): List<String> {
        return listOf<String>(
            "https://i.ibb.co/JzwpmcB/banner2.png",
            "https://i.ibb.co/wrn9Z3Y/banner1.png",
            "https://i.ibb.co/JzwpmcB/banner2.png",
            "https://i.ibb.co/wrn9Z3Y/banner1.png",
            "https://i.ibb.co/JzwpmcB/banner2.png",
            "https://i.ibb.co/wrn9Z3Y/banner1.png",
        )
    }
}