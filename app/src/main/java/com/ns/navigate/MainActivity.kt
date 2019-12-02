package com.ns.navigate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById(R.id.button) as Button
   val username=editText.text
        val password1=editText2.text
        print(username.toString())
        print(password1.toString())
        button.setOnClickListener {
            if (username.toString()=="Venkatesh"&&password1.toString()=="abc123") {

                val intent = Intent(this@MainActivity, Main2Activity::class.java)
                startActivity(intent)
            }
            else
            {
                    Toast.makeText(applicationContext,"Username or passsword is wrong", Toast.LENGTH_SHORT).show()

                   if(editText.text.toString().length==0&&editText2.text.toString().length==0) {
                       Toast.makeText(
                           applicationContext,
                           "Username or passsword cannot be empty",
                           Toast.LENGTH_SHORT
                       ).show()
                   }
            }
            DataSource.uname = editText.text.toString()
        }

        val signup=findViewById(R.id.signup) as TextView

        signup.setOnClickListener{
            val intent=Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
