package com.pet.telegrambot.command;

import com.pet.telegrambot.validator.MessageValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class TelegramCommandFactory {
    private static final String COMMAND = "Command";
    private static final String NOT_COMMAND = "not" + COMMAND;
    private final Map<String,TelegramCommand> commandMap;
    public TelegramCommand createCommand(String message) {
        if(!MessageValidator.isCommand(message)) {
            return commandMap.get(NOT_COMMAND);
        }
        String commandName = message.substring(1, message.length() - 1) + COMMAND;
        TelegramCommand telegramCommand = commandMap.get(commandName);
        return Objects.isNull(telegramCommand) ? commandMap.get(NOT_COMMAND) : telegramCommand;
    }
}
