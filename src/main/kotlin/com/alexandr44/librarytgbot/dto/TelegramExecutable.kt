package com.alexandr44.librarytgbot.dto

import org.telegram.telegrambots.bots.TelegramLongPollingBot

fun interface TelegramExecutable {

    fun execute(bot: TelegramLongPollingBot)

}