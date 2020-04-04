package com.fgihub.stopcoronacmr.ui.econsultation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EConsultationViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is E-Consulting Fragment"
    }
    val text: LiveData<String> = _text
}
