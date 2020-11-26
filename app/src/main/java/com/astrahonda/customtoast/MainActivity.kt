package com.astrahonda.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.toast1).setOnClickListener {
            normalToast()
        }

        findViewById<Button>(R.id.danger).setOnClickListener {
            danger()
        }

        findViewById<Button>(R.id.info).setOnClickListener {
            info()
        }

        findViewById<Button>(R.id.success).setOnClickListener {
            success()
        }

        findViewById<Button>(R.id.love).setOnClickListener {
            love()
        }
    }

    fun normalToast(){
        Toast.makeText(this@MainActivity,"Ini Toast Normal!",Toast.LENGTH_LONG).show()
    }


    fun love(){
        val inflater = layoutInflater
        val layout : View = inflater.inflate(R.layout.custom_toast,findViewById(R.id.custom_toast_layout))
        val text : TextView = layout.findViewById(R.id.text)
        text.text = "Some Love!!!"
        with(Toast(applicationContext)){
            setGravity(Gravity.CENTER_VERTICAL,0,0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }

    fun danger(){
        val inflater = layoutInflater
        val layout : View = inflater.inflate(R.layout.danger_toast,findViewById(R.id.custom_toast_layout))
        val title : TextView = layout.findViewById(R.id.title)
        title.text = "Ada masalah!!!"
        val description : TextView = layout.findViewById(R.id.description)
        description.text = "Toast ini memiliki masalah yang serius!"
        with(Toast(applicationContext)){
            setGravity(Gravity.END or Gravity.TOP,0,0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }

    fun info(){
        val inflater = layoutInflater
        val layout : View = inflater.inflate(R.layout.info_toast,findViewById(R.id.custom_toast_layout))
        val title : TextView = layout.findViewById(R.id.title)
        title.text = "Ada notifikasi"
        val description : TextView = layout.findViewById(R.id.description)
        description.text = "Toast ini memiliki notifikasi yang penting!"
        with(Toast(applicationContext)){
            setGravity(Gravity.END or Gravity.TOP,0,0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }

    fun success(){
        val inflater = layoutInflater
        val layout : View = inflater.inflate(R.layout.success_toast,findViewById(R.id.custom_toast_layout))
        val title : TextView = layout.findViewById(R.id.title)
        title.text = "Berhasil!"
        val description : TextView = layout.findViewById(R.id.description)
        description.text = "Kamu berhasil menampilkan Toast Ini!"
        with(Toast(applicationContext)){
            setGravity(Gravity.END or Gravity.TOP,0,0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}

