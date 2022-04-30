package com.example.techmodul4.ui.home

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.techmodul4.databinding.ActivityHomeDetailBinding

class HomeDetailActivity : AppCompatActivity() {

    private var _binding: ActivityHomeDetailBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_NAME = "name"
        const val EXTRA_IMAGE = "image"
        const val EXTRA_DESCRIPTION = "desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityHomeDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.nameDetail
        name.text = intent.getStringExtra(EXTRA_NAME)

        val description = binding.descDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}