package com.example.localdatabasesqlite

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ListAdapter (private val context: Activity, private val id:Array<String>, private val name:Array<String>,
                   private val email:Array<String>):ArrayAdapter<String>(context, R.layout.item){

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater= context.layoutInflater
        val rowView= inflater.inflate(R.layout.item, null, true)

        val u_id= rowView.findViewById(R.id.textViewId) as TextView
        val u_name= rowView.findViewById(R.id.textViewName) as TextView
        val u_email= rowView.findViewById(R.id.textViewEmail) as TextView

        u_id.text= "Id: ${id[position]}"
        u_name.text= "Id: ${name[position]}"
        u_email.text= "Id: ${email[position]}"

        return rowView
    }

}