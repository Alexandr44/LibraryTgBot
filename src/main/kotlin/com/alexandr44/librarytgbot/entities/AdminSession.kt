package com.alexandr44.librarytgbot.entities

import jakarta.persistence.*
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.Instant

@Entity
@Table(name = "admin_sessions")
@EntityListeners(AuditingEntityListener::class)
data class AdminSession(

    @Id
    @Column(nullable = false, updatable = false)
    val userId: Long,

    @Column(nullable = false, name = "state", length = 255)
    val state: String,

    @Column(nullable = false, name = "buffer_json", length = 1000)
    val bufferJson: String,

    @LastModifiedDate
    @Column(nullable = false, name = "updated_at")
    var updatedAt: Instant

)