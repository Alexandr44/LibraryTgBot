package com.alexandr44.librarytgbot.entities

import com.alexandr44.librarytgbot.enums.UserRole

data class User(
    val id: Long,
    val telegramUserId: Long,
    val username: String?,
    val firstName: String?,
    val lastName: String?,
    val role: UserRole,
    val createdAt: Long,
    val lastSeenAt: Long
)