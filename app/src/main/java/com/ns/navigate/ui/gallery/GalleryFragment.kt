package com.ns.navigate.ui.gallery

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ns.navigate.ListActivity
import com.ns.navigate.R
import com.ns.shopping.CustomAdapter
import kotlinx.android.synthetic.main.productlayout.*

class GalleryFragment : Fragment(),AdapterView.OnItemSelectedListener {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
       // val root1 = inflater.inflate(R.layout.fragment_gallery, container, false)
        val listView: ListView = root.findViewById(R.id.listView)

        galleryViewModel.text.observe(this, Observer {
            listView.setBackgroundColor(Color.WHITE)

            val myAdapter = CustomAdapter(activity!!.applicationContext,ListActivity.list){position,data-> when(data)
            {
                "addtocart" -> Toast.makeText(activity!!.applicationContext,"Added to cart",Toast.LENGTH_SHORT).show()
            }}
            listView.adapter=myAdapter

        })


        return root
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


    }
}