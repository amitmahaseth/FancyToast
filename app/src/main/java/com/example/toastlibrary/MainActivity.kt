package com.example.toastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stylish_toast.StylishToaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StylishToaster.simpleToast(this,"Good")
    }
}