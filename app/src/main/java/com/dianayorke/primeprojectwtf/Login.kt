package com.dianayorke.primeprojectwtf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = this.findViewById(R.id.loginButton)
        val userNameAdded: EditText = findViewById(R.id.username)

        loginButton.setOnClickListener {
            val nameOfUser:String = userNameAdded.text.toString()
            var message="";

            if(nameOfUser.matches(Regex(pattern = ^[A-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\.[A-Z0-9_!#$%&'*+/=?`{|}~^-]+↵
            )*@[A-Z0-9-]+(?:\.[A-Z0-9-]+)*$))){
                message = "You have to enter a valid e-mail address"
            }else{
                message = "Proceed to enter password"
            }

            this.startActivity(i)
        }

        val userPasswordAdded: EditText = findViewById(R.id.password)
        if(userPasswordAdded.length() > 22){
            println("Maximum 22 character password")
        }if(userPasswordAdded.matches(Regex))

        val forgottenPassword: Button = this.findViewById(R.id.forgotten_p)
        forgottenPassword.setOnClickListener {
            val i = Intent(this, Forgotpassword::class.java)

            this.startActivity(i)
        }
        val createAccount: Button = this.findViewById(R.id.createAccount)

        createAccount.setOnClickListener {
            val i = Intent(this, Signup::class.java)

            this.startActivity(i)
        }

    }
}