package com.ns.navigate

import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.ns.navigate.DataSource.uname
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_slideshow.*
import kotlinx.android.synthetic.main.fragment_slideshow.view.*
import kotlinx.android.synthetic.main.nav_header_main2.view.*
import kotlinx.android.synthetic.main.productlayout.*


class Main2Activity : AppCompatActivity() {

//    var view:View?=null
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



       // val fab: FloatingActionButton = findViewById(R.id.fab)
     //   fab.setOnClickListener { view ->
       //     Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
       //         .setAction("Action", null).show()
      //  }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

//        navView.getHeaderView(R.layout.nav_header_main2).username.text = DataSource.uname
        val view: View = navView.getHeaderView(0)
//        view=navView.inflateHeaderView(R.layout.nav_header_main2)
        view.username?.text=uname
       // view.textView3?.text= uname
        //val view1:View=layoutInflater.inflate(R.layout.fragment_slideshow,null)
     //   view1.textView3?.text=DataSource.firstname

      // textView3.text=DataSource.firstname as Editable

//        imageView3.setOnClickListener { val mdialog=LayoutInflater.from(this).inflate(R.layout.productlayout,null)
//        val builer=AlertDialog.Builder(this).setView(mdialog).setTitle("Image")
//        val malert=builer.show()}
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main2, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
