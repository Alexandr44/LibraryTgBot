package com.alexandr44.librarytgbot.telegram

import com.alexandr44.librarytgbot.telegram.properties.TelegramBotProperties
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

class LibraryTelegramBot(
    private val updateDispatcher: UpdateDispatcher,
    private val properties: TelegramBotProperties,
) : TelegramLongPollingBot(properties.token) {

    override fun getBotUsername(): String {
        return properties.username
    }

    override fun onUpdateReceived(update: Update?) {
        update?.let {
            updateDispatcher.dispatch(it)
        }
    }
}