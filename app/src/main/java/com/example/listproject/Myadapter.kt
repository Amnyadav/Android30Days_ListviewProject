package com.example.listproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Myadapter(var context1:Context,var arrayList: ArrayList<User>):ArrayAdapter<User>(context1,R.layout.custom_listview,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(context).inflate(R.layout.custom_listview,parent,false)
        val username=view.findViewById<TextView>(R.id.name)
        val lastmsg=view.findViewById<TextView>(R.id.msg)
        val time=view.findViewById<TextView>(R.id.msgtime)
        val image=view.findViewById<CircleImageView>(R.id.profile_image)
        username.text=arrayList[position].name
        lastmsg.text=arrayList[position].msg
        time.text=arrayList[position].time
        image.setImageResource(arrayList[position].img)
        return view
    }

}