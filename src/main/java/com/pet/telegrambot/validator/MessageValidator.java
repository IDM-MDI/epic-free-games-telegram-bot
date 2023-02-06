package com.pet.telegrambot.validator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageValidator {
    public static boolean hasNoMessage(Update update) {
        return Objects.isNull(update) || !update.hasMessage() || !update.getMessage().hasText();
    }
    public static boolean isCommand(String text) {
        return Objects.nonNull(text) &&
                !text.isBlank() &&
                text.charAt(0) == '/';
    }
}
