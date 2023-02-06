package com.pet.telegrambot.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class TelegramCommandFactory {
    private static final String NOT_COMMAND = "notCommand";
    private final Map<String,TelegramCommand> commandMap;
    public TelegramCommand createCommand(String message) {
        TelegramCommand telegramCommand = commandMap.get(message.substring(1, message.length() - 1));
        return Objects.isNull(telegramCommand) ? commandMap.get(NOT_COMMAND) : telegramCommand;
    }
}
