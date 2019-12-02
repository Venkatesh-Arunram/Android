package com.ns.navigate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val register=findViewById(R.id.register) as Button

        register.setOnClickListener{
            DataSource.firstname=firstname.text.toString()
           DataSource.lastname=editText4.text.toString()
            DataSource.email=editText5.text.toString()
           DataSource.phone=editText6.text.toString()
            val intent= Intent(this@RegisterActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
