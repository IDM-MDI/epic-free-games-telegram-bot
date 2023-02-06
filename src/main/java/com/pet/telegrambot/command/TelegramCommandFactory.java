package com.pet.telegrambot.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class TelegramCommandFactory {
    private final Map<String,TelegramCommand> commandMap;
    public TelegramCommand createCommand(String message) {
        return null;
    }
}
