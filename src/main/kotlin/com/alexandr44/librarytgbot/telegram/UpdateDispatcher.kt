package com.alexandr44.librarytgbot.telegram

import com.alexandr44.librarytgbot.dto.Action
import com.alexandr44.librarytgbot.telegram.handlers.UpdateHandler
import mu.KotlinLogging
import org.springframework.stereotype.Component
import org.telegram.telegrambots.meta.api.objects.Update

@Component
class UpdateDispatcher(
    private val handlers: List<UpdateHandler>
) {

    private val log = KotlinLogging.logger {}

    fun dispatch(update: Update): List<Action> {
        log.info("Got message: $update")

        return handlers
            .firstOrNull { it.supports(update) }
            ?.handle(update)
            ?: emptyList()

    }

}