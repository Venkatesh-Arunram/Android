package com.ns.navigate.ui.tools

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ns.navigate.MainActivity
import com.ns.navigate.R

class ToolsFragment : Fragment() {

    private lateinit var toolsViewModel: ToolsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        toolsViewModel =
            ViewModelProviders.of(this).get(ToolsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tools, container, false)
        //val textView: TextView = root.findViewById(R.id.text_tools)

        toolsViewModel.text.observe(this, Observer {
            val builder = AlertDialog.Builder(this.activity)
            builder.setTitle("Confirmation")
            builder.setIcon(R.drawable.ic_exit)
            builder.setMessage("Do u want to Logout ?")
            builder.setPositiveButton("Yes", { dialog: DialogInterface?, which: Int ->

                startActivity(Intent(this.activity,MainActivity::class.java))

            })
            builder.setNegativeButton("No",null)
            builder.setNeutralButton("cancel",{ dialog: DialogInterface?, which: Int -> null })
            builder.show()

        })

        return root
    }
}