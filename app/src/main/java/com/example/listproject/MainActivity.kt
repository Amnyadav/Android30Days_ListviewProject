
package com.example.listproject

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
        arrayList=ArrayList()
        for (eachindex in name.indices) {
            arrayList.add(User(name[eachindex],msg[eachindex],time[eachindex],img[eachindex]))
        }
        var listView=findViewById<ListView>(R.id.listview)
        listView.isClickable=true
        listView.adapter=Myadapter(this,arrayList)

    }
}