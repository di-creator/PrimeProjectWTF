package com.dianayorke.primeprojectwtf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val loginButton: Button = this.findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val intent = Intent(this, page3::class.java )

            this.startActivity(intent)
        }

    }
}