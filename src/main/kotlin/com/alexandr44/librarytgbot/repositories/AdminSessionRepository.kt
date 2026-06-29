package com.alexandr44.librarytgbot.repositories

import com.alexandr44.librarytgbot.entities.AdminSession
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AdminSessionRepository : JpaRepository<AdminSession, Long> {

}
