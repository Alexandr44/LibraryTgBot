package com.alexandr44.librarytgbot.entities

import jakarta.persistence.*

@Entity
@Table(name = "exercises")
data class Exercise(

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = true, name = "category_id")
    val categoryId: Long,

    @Column(nullable = true, name = "title", length = 255)
    val title: String,

    @Column(nullable = true, name = "sort_order")
    val sortOrder: Int
)