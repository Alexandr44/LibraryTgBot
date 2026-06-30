package com.alexandr44.librarytgbot.config

import com.alexandr44.librarytgbot.telegram.LibraryTelegramBot
import com.alexandr44.librarytgbot.telegram.UpdateDispatcher
import com.alexandr44.librarytgbot.telegram.properties.TelegramBotProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.telegram.telegrambots.bots.TelegramLongPollingBot

@Configuration
class BotConfig {

    @Bean
    fun telegramHeadHunterBot(
        dispatcher: UpdateDispatcher,
        properties: TelegramBotProperties
    ): TelegramLongPollingBot {
        return LibraryTelegramBot(dispatcher, properties)
    }

}