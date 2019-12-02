package com.ns.navigate.ui.slideshow

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ns.navigate.DataSource

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = com.ns.navigate.DataSource.uname
        value=com.ns.navigate.DataSource.email
        value=com.ns.navigate.DataSource.firstname
        value=com.ns.navigate.DataSource.lastname
        value=com.ns.navigate.DataSource.phone
    }
    val text: LiveData<String> = _text
}
