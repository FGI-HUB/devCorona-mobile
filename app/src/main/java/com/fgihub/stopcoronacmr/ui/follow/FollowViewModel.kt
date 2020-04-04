package com.fgihub.stopcoronacmr.ui.follow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FollowViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Follow Fragment"
    }
    val text: LiveData<String> = _text
}
