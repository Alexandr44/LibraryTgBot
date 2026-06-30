package com.alexandr44.librarytgbot.dto

sealed interface Action

data object NoAction : Action

data class SendTextAction(
    val chatId: Long,
    val text: String
) : Action

data class EditTextAction(
    val chatId: Long,
    val messageId: Int,
    val text: String
) : Action

data class SendAnimationAction(
    val chatId: Long,
    val telegramFileId: String,
    val caption: String?
) : Action

data class SendPhotoAction(
    val chatId: Long,
    val telegramFileId: String,
    val caption: String?
) : Action

data class SendVideoAction(
    val chatId: Long,
    val telegramFileId: String,
    val caption: String?
) : Action

data class ShowMenuAction(
    val chatId: Long,
    val messageId: Int?,
    val text: String,
    val buttons: List<MenuButton>
) : Action

data class MenuButton(
    val text: String,
    val callbackData: String
)
