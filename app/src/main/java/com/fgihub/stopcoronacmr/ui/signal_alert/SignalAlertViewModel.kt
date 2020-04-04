package com.fgihub.stopcoronacmr.ui.signal_alert

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignalAlertViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Signal Alert Fragment"
    }
    val text: LiveData<String> = _text
}
