package com.example.ocuser.horoscopes

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Fragment01(): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val layout = inflater?.inflate(R.layout.fragment01, container, false)
        val index = arguments!!.getInt("index")

        layout.findViewById<TextView>(R.id.txtName1).text = "${MainActivity.astroList[index].name}の総合運"
        layout.findViewById<TextView>(R.id.txtContent1).text = MainActivity.astroList[index].content
        layout.findViewById<ImageView>(R.id.imgHoro1).setImageResource( MainActivity.astroList[index].imgName )
        return layout
    }
}
