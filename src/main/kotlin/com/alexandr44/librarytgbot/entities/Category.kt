package com.alexandr44.librarytgbot.entities

import jakarta.persistence.*

@Entity
@Table(name = "categories")
data class Category(

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = true, name = "parent_id")
    val parentId: Long?,

    @Column(nullable = false, name = "title", length = 255)
    val title: String,

    @Column(nullable = false, name = "sort_order")
    val sortOrder: Int
)