package com.pet.telegrambot.validator;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UpdateValidator {
    public static boolean hasNoMessage(Update update) {
        return Objects.isNull(update) || !update.hasMessage() || !update.getMessage().hasText();
    }
}
