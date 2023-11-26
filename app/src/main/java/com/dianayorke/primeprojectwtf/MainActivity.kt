package com.dianayorke.primeprojectwtf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinButton: Button = this.findViewById(R.id.joinButton)

        joinButton.setOnClickListener {
            val intent = Intent(this, Login::class.java )

            this.startActivity(intent)
        }


    }
}