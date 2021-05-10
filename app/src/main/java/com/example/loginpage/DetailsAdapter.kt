package com.example.loginpage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class DetailsAdapter(context: Context, facts:List<ClubsModel>): ArrayAdapter<ClubsModel>(context, 0, facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var show = convertView
        var fact = getItem(position)
        if (show == null){
            show = LayoutInflater.from(parent.context).inflate(R.layout.details_item, parent, false)
        }
        val logo = show?.findViewById<ImageView>(R.id.imageLayout)
        val identify = show?.findViewById<TextView>(R.id.detailedName)

        fact?.logo?.let {
            logo?.setImageResource(fact.logo)
        }

        identify?.text = fact?.name

        show?.setOnClickListener {
            val intent = Intent(parent.context, DetailedActivity::class.java)
            intent.putExtra(LOGO_EXTRAS, fact?.logo)
            intent.putExtra(NAME_EXTRAS, fact?.name)
            intent.putExtra(DETAILS_EXTRAS, fact?.details)
            parent.context.startActivity(intent)

        }

        return show !!
    }
    companion object{
        val LOGO_EXTRAS = "logo_extras"
        val NAME_EXTRAS = "name_extras"
        val DETAILS_EXTRAS = "detail_extras"
    }

}