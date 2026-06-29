package com.alexandr44.librarytgbot.entities

data class AdminSession(
    val userId: Long,
    val state: String,
    val bufferJson: String,
    val updatedAt: Long
)