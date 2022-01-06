package com.example.lostarkcheckcompose.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.lostarkcheckcompose.data.models.Job
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor() : ViewModel() {
    val curJob: MutableState<Job> = mutableStateOf(Job.NONE)
}