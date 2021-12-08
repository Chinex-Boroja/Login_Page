package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logIn()
    }
    private fun logIn() {
        val emailAddress = findViewById<TextInputEditText>(R.id.username_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val logIn= findViewById<MaterialButton>(R.id.next_button)

        logIn.setOnClickListener() {
            if (emailAddress.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "email or password empty! please input text", Toast.LENGTH_LONG).show()
            }else{
                if (emailAddress.text.toString() == "ihediohachinedu21.com" && password.text.toString() == "Boroja24"){
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Incorrect email or password!!", Toast.LENGTH_LONG).show()
                }

            }
        }

    }
}