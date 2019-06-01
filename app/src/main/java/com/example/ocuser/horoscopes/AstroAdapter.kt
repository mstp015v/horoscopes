package com.example.ocuser.horoscopes

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class AstroAdapter(context: Context, val astroList : List<AstroFortun>,private val onItemClicked:()->Unit) : RecyclerView.Adapter<AstroAdapter.AstroViewHolder>(){

    private val inflater = LayoutInflater.from( context )


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AstroViewHolder {
        val view = inflater.inflate(R.layout.list_row,p0,false)
        val viewHolder = AstroViewHolder(view)

        //リサイクラーをクリックしたときの処理
        view.setOnClickListener{}

        return viewHolder
    }

    override fun getItemCount() = astroList.size

    override fun onBindViewHolder(p0: AstroViewHolder, p1: Int) {
        p0.imgAstor.setImageResource(astroList[p1].imgName)
        p0.txtAstroName.text = astroList[p1].name
        p0.txtOverview.text = astroList[p1].content

    }


    class AstroViewHolder( view : View):RecyclerView.ViewHolder(view){
        val imgAstor = view.findViewById<ImageView>(R.id.imgAstro)
        val txtAstroName = view.findViewById<TextView>(R.id.txtAstroName)
        val txtOverview = view.findViewById<TextView>(R.id.txtOverview)
    }
}