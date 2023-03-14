
package com.example.listproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var arrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name= arrayOf("Amn","Harshit","Shashank","Aviral","Harish","Prince")
        var msg= arrayOf("hii amn","wassup","fine","trueeeee","okiee","ooooo")
        var time= arrayOf("2:40AM","4:44AM","6:09PM","3:21PM","12:00AM","8:20AM")
        var img= intArrayOf(R.drawable.pic4,R.drawable.images,R.drawable.pic3,R.drawable.pic1,R.drawable.pic5,R.drawable.pic6)
        val phonenum= arrayOf("7489647744","172214","173314","00012243","123450607","975556183")
        arrayList=ArrayList()
        for (eachindex in name.indices) {
            arrayList.add(User(name[eachindex],msg[eachindex],time[eachindex],img[eachindex]))
        }
        var listView=findViewById<ListView>(R.id.listview)
        listView.isClickable=true
        listView.adapter=Myadapter(this,arrayList)
        listView.setOnItemClickListener { parent, view, position, id ->
            val tvname=name[position]
            val tvphone=phonenum[position]
            val imgid=img[position]
            val i=Intent(this,InfoActivity::class.java)
            i.putExtra("name",tvname)
            i.putExtra("phone",tvphone)
            i.putExtra("imgid",imgid)
            startActivity(i)
        }

    }
}