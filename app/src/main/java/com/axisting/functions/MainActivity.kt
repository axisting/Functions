package com.axisting.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked (view : View){
        Toast.makeText(applicationContext, "BUTON TIKLANDI " , Toast.LENGTH_LONG).show()
    }
}
