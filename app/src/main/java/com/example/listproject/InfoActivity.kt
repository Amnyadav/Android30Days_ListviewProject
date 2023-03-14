package com.example.listproject



import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val nameuser = intent.getStringExtra("name")
        val phonenum = intent.getStringExtra("phone")
        val imageid = intent.getIntExtra("imgid", R.drawable.pic4)
        val tvname = findViewById<TextView>(R.id.tvname)
        val tvphone = findViewById<TextView>(R.id.tvphone)
        val imgview = findViewById<ImageView>(R.id.profile)
        tvname.text = nameuser
        tvphone.text = phonenum
        imgview.setImageResource(imageid)

    }
}