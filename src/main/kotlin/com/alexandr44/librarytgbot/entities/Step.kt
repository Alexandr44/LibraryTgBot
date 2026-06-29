package com.alexandr44.librarytgbot.entities

import com.alexandr44.librarytgbot.enums.StepType
import jakarta.persistence.*

@Entity
@Table(name = "steps")
data class Step(

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, name = "exercise_id")
    val exerciseId: Long,

    @Column(nullable = false, name = "sort_order")
    val sortOrder: Int,

    @Column(nullable = false, name = "type", length = 255)
    val type: StepType,

    @Column(nullable = false, name = "payload", length = 1000)
    val payload: String
)