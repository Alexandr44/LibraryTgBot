package com.alexandr44.librarytgbot.telegram.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "telegram.bot")
class TelegramBotProperties {
    lateinit var token: String
    lateinit var username: String
}