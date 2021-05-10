package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpage.databinding.ActivityDetailedBinding
import com.example.loginpage.databinding.ActivityLoginBinding

class DetailedActivity : AppCompatActivity() {
    private var binding: ActivityDetailedBinding? = null

    private var logo: Int = 0
    private var name: String = ""
    private var details: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        logo = intent.getIntExtra(DetailsAdapter.LOGO_EXTRAS, 0)
        name = intent.getStringExtra(DetailsAdapter.NAME_EXTRAS).toString()
        details = intent.getStringExtra(DetailsAdapter.DETAILS_EXTRAS).toString()

        setupFactDetails()
    }
    private fun setupFactDetails(){
        binding?.textViewId?.text = details
        binding?.imageView?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}