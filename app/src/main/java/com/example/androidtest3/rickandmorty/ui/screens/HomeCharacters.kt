package com.example.androidtest3.rickandmorty.ui.screens

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.androidtest3.MainViewModel

@Composable
fun HomeCharacters(
    viewModel: MainViewModel = hiltViewModel()
){

    val response = viewModel.getCharacter.collectAsState().value


    Button(onClick = {}) {
        if (response != null)
        Text("Ir a detalle ${response.results?.first()?.name}")
    }
}