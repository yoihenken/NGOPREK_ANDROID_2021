package com.henken.uiandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load
import com.henken.uiandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvHome.size = getAds().size
        binding.cvHome.setCarouselViewListener { view, position ->
            val carouselImage = view.findViewById<ImageView>(R.id.iv_carousel)
            carouselImage.load( getAds()[position] )
        }
        binding.cvHome.show()
    }

    fun getAds() : List<String> {
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