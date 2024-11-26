package com.example.gymapp.Models

data class Exercises (
    val id: String,
    val title: String,
    val bodyPartsId: Array<String>,
    val imageUrl: String,
    val videoUrl: String
)