package com.example.sampleloginapp.ui.view


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.example.sampleloginapp.R


class HomeActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }



    override fun onSupportNavigateUp(): Boolean {
       onSupportNavigateUp()
        return super.onSupportNavigateUp()
    }


}