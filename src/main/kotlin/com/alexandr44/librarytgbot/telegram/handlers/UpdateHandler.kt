package com.alexandr44.librarytgbot.telegram.handlers

import com.alexandr44.librarytgbot.dto.Action
import org.telegram.telegrambots.meta.api.objects.Update

interface UpdateHandler {

    fun supports(update: Update): Boolean

    fun handle(update: Update): List<Action>

}