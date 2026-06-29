package com.alexandr44.librarytgbot.entities

import com.alexandr44.librarytgbot.enums.UserRole
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener::class)
data class User(

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, name = "telegram_user_id", length = 255)
    val telegramUserId: Long,

    @Column(nullable = false, name = "username", length = 255)
    val username: String?,

    @Column(nullable = false, name = "first_name", length = 255)
    val firstName: String?,

    @Column(nullable = false, name = "last_name", length = 255)
    val lastName: String?,

    @Column(nullable = false, name = "role", length = 255)
    val role: UserRole,

    @CreatedDate
    @Column(nullable = false, name = "created_at", length = 255)
    var createdAt: Instant,

    @LastModifiedDate
    @Column(nullable = false, name = "updatedAt", length = 255)
    var updatedAt: Instant
)