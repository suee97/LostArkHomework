package com.example.lostarkcheckcompose.ui.screens.home

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            HomeAppBar()
        },
        content = {},
        floatingActionButton = {}
    )
}