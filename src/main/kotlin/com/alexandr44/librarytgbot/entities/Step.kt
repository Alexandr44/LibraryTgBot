package com.alexandr44.librarytgbot.entities

import com.alexandr44.librarytgbot.enums.StepType

data class Step(
    val id: Long,
    val exerciseId: Long,
    val sortOrder: Int,
    val type: StepType,
    val payload: String
)