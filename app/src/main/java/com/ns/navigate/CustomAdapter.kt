package com.ns.shopping

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.ns.navigate.ImageList
import com.ns.navigate.R
import kotlinx.android.synthetic.main.productlayout.*

class CustomAdapter( val context: Context, private val names:ArrayList<ImageList>,  val maketoast:(Int, String)->Unit): BaseAdapter()
{
    private class viewHolder(row: View)
    {
        var imageView3:ImageView
        var textView4: TextView
        var textView5: TextView
        var button4: Button
        var button5: Button
        var spinner: Spinner
        init {
            this.textView4=row?.findViewById(R.id.textView4) as TextView
            this.textView5=row?.findViewById(R.id.textView5) as TextView
            // this.button5=row?.findViewById(R.id.button5) as Button
            this.button4=row?.findViewById(R.id.button4) as Button
            this.button5=row?.findViewById(R.id.button5) as Button
            this.imageView3=row?.findViewById(R.id.imageView3) as ImageView
            this.spinner=row?.findViewById(R.id.spinner) as Spinner
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View?
        var viewHolder:viewHolder
        if(convertView==null)
        {
            var inflater= LayoutInflater.from(context)
            view =inflater.inflate(R.layout.productlayout,parent,false)
            viewHolder=viewHolder(view)
            view.tag=viewHolder
        }
        else
        {
            view=convertView
            viewHolder=view.tag as viewHolder
        }
        viewHolder.button4.setOnClickListener {

            maketoast(position,"addtocart")
        }
        var options= arrayOf("1","2","3","4","5","6","7")
        viewHolder.spinner.adapter= ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,options)
        var img=getItem(position)
        var image:ImageList=getItem(position) as ImageList
        viewHolder.textView4.text=image.description
        viewHolder.textView5.text=image.messages
        viewHolder.imageView3.setImageResource(image.img)
        return  view as View
    }


    override fun getItem(position: Int): Any {
        return names.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {

        return names.count() }
}