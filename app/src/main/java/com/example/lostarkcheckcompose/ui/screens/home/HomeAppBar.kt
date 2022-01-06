package com.example.lostarkcheckcompose.ui.screens.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lostarkcheckcompose.R
import com.example.lostarkcheckcompose.ui.theme.topAppBarContentColor

@Composable
fun HomeAppBar() {
    var expanded by remember {mutableStateOf(false)}

    TopAppBar(
        title = {
            Text(stringResource(id = R.string.home_app_bar))
        },
        actions = {
            IconButton(onClick = { expanded = true }) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = stringResource(id = R.string.home_more),
                    tint = MaterialTheme.colors.topAppBarContentColor
                )
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    DropdownMenuItem(onClick = { expanded = false }) {
                        Text("one")
                    }
                    DropdownMenuItem(onClick = { expanded = false }) {
                        Text("two")
                    }
                    DropdownMenuItem(onClick = { expanded = false }) {
                        Text("three")
                    }
                }
            }
        }
    )
}

@Preview
@Composable
private fun HomeAppBarPrev() {
    HomeAppBar()
}