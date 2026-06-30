package com.alexandr44.librarytgbot.telegram.handlers

import com.alexandr44.librarytgbot.dto.Action
import org.springframework.stereotype.Component
import org.telegram.telegrambots.meta.api.objects.Update

@Component
class MessageHandler : UpdateHandler {

    override fun supports(update: Update) = update.hasMessage()

    override fun handle(update: Update): List<Action> {
        TODO("Not yet implemented")
    }


}