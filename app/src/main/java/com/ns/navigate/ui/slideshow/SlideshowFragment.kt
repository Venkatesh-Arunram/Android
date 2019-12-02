package com.ns.navigate.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ns.navigate.DataSource
import com.ns.navigate.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_slideshow.view.*
import java.sql.DataTruncation

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val profiletext: TextView = root.findViewById(R.id.textView3)
        Log.d("bjj","${DataSource.firstname}")
        if(DataSource.uname=="Venkatesh") {
//            root.textView3.text = DataSource.firstname
//            root.textView8.text = DataSource.lastname
//            root.textView12.text = DataSource.email
//            root.phonenumber.text = DataSource.phone
            root.textView3.text = "Venkatesh"
            root.textView8.text = "Arunram"
            root.textView12.text = "venkatesh.arunram@gmail.com"
            root.phonenumber.text = "9043130503"
        }
//        slideshowViewModel.text.observe(this, Observer {
////            profiletext.text = it
//        })
        return root
    }
}