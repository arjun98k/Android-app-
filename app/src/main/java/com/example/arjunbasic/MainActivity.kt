package com.example.arjunbasic




import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btnup = findViewById<Button>(R.id.btn)
//        btnup.setOnClickListener{
//            Toast.makeText(applicationContext, "Arjun kandekar",Toast.LENGTH_SHORT).show()
//            val btnup2 = findViewById<Button>(R.id.btn3)
//
//            btnup2.setOnClickListener{
//                Toast.makeText(applicationContext, "My first app",Toast.LENGTH_SHORT).show()
//            }
//        }

        val darkbtn =findViewById<Button>(R.id.btndark)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)

        var isDark = false

        darkbtn.setOnClickListener {
            if (isDark){
                layout.setBackgroundColor(R.color.white)
            }else{
                layout.setBackgroundColor(R.color.black)
            }
            isDark = !isDark
        }

    }
}