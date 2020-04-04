package com.fgihub.stopcoronacmr.ui.symptome

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SymptomeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Symptome Fragment"
    }
    val text: LiveData<String> = _text
}
