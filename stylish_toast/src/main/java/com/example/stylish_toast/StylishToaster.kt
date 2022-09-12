package com.example.stylish_toast

import android.content.Context
import android.widget.Toast

 object StylishToaster {
     fun simpleToast(context:Context,message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}