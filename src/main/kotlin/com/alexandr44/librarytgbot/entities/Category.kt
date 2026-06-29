package com.alexandr44.librarytgbot.entities

data class Category(
    val id: Long,
    val parentId: Long?,
    val title: String,
    val sortOrder: Int
)