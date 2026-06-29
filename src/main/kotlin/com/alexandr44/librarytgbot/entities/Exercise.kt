package com.alexandr44.librarytgbot.entities

data class Exercise(
    val id: Long,
    val categoryId: Long,
    val title: String,
    val sortOrder: Int
)