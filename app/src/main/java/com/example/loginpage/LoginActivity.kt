package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpage.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    var binding : ActivityLoginBinding? = null
    var adapter: DetailsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setupDetails()
    }

    private fun setupDetails(){
        adapter = DetailsAdapter(this, DummyData.details)
        binding?.detailsView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}