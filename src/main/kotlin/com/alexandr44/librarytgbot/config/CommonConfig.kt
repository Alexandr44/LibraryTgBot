package com.alexandr44.librarytgbot.config

import com.alexandr44.librarytgbot.telegram.properties.TelegramBotProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(TelegramBotProperties::class)
class CommonConfig