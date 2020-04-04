package com.fgihub.stopcoronacmr.ui.evolution

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EvolutionViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Evolution Fragment"
    }
    val text: LiveData<String> = _text
}
