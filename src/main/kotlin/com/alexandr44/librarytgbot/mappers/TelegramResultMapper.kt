package com.alexandr44.librarytgbot.mappers

import com.alexandr44.librarytgbot.dto.*
import org.springframework.stereotype.Service
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto
import org.telegram.telegrambots.meta.api.methods.send.SendVideo
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText
import org.telegram.telegrambots.meta.api.objects.InputFile
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton

@Service
class TelegramResultMapper {

    fun map(action: Action): List<TelegramExecutable> {

        return when (action) {

            NoAction ->
                emptyList()

            is SendTextAction ->
                listOf(
                    TelegramExecutable {
                        it.execute(
                            SendMessage.builder()
                                .chatId(action.chatId)
                                .text(action.text)
                                .build()
                        )
                    }
                )

            is EditTextAction ->
                listOf(
                    TelegramExecutable {
                        it.execute(
                            EditMessageText.builder()
                                .chatId(action.chatId)
                                .messageId(action.messageId)
                                .text(action.text)
                                .build()
                        )
                    }
                )

            is SendPhotoAction ->
                listOf(
                    TelegramExecutable {
                        it.execute(
                            SendPhoto.builder()
                                .chatId(action.chatId)
                                .photo(InputFile(action.telegramFileId))
                                .caption(action.caption)
                                .build()
                        )
                    }
                )

            is SendVideoAction ->
                listOf(
                    TelegramExecutable {
                        it.execute(
                            SendVideo.builder()
                                .chatId(action.chatId)
                                .video(InputFile(action.telegramFileId))
                                .caption(action.caption)
                                .build()
                        )
                    }
                )

            is SendAnimationAction ->
                listOf(
                    TelegramExecutable {
                        it.execute(
                            SendAnimation.builder()
                                .chatId(action.chatId)
                                .animation(InputFile(action.telegramFileId))
                                .caption(action.caption)
                                .build()
                        )
                    }
                )

            is ShowMenuAction -> {
                val keyboard = InlineKeyboardMarkup()
                keyboard.keyboard = action.buttons.map {
                    listOf(
                        InlineKeyboardButton.builder()
                            .text(it.text)
                            .callbackData(it.callbackData)
                            .build()
                    )
                }

                if (action.messageId == null) {
                    listOf(
                        TelegramExecutable {
                            it.execute(
                                SendMessage.builder()
                                    .chatId(action.chatId)
                                    .text(action.text)
                                    .replyMarkup(keyboard)
                                    .build()
                            )
                        }
                    )

                } else {
                    listOf(
                        TelegramExecutable {
                            it.execute(
                                EditMessageText.builder()
                                    .chatId(action.chatId)
                                    .messageId(action.messageId)
                                    .text(action.text)
                                    .replyMarkup(keyboard)
                                    .build()
                            )
                        }
                    )

                }

            }

        }

    }


}
