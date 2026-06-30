package com.alexandr44.librarytgbot.telegram

import com.alexandr44.librarytgbot.telegram.handlers.CallbackHandler
import com.alexandr44.librarytgbot.telegram.handlers.MessageHandler
import mu.KotlinLogging
import org.springframework.stereotype.Component
import org.telegram.telegrambots.meta.api.objects.Update

@Component
class UpdateDispatcher(
    private val callbackHandler: CallbackHandler,
    private val messageHandler: MessageHandler
) {

    private val log = KotlinLogging.logger {}

    fun dispatch(update: Update) {
        log.info("Got message: $update");
        when {
            update.hasCallbackQuery() ->
                callbackHandler.handle(update.callbackQuery)

            update.hasMessage() ->
                messageHandler.handle(update.message)
        }
    }

}