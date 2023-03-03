package com.pet.telegrambot.command.impl;

import com.pet.telegrambot.command.TelegramCommand;
import com.pet.telegrambot.service.MessageService;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethodMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

@Component("startCommand")
public class WelcomeCommand extends TelegramCommand {
    private static final String DEFAULT_MESSAGE = "Welcome to Epic Free Game News. " +
            "This bot can show you: what games now free, description, expire date. Use command /games to get one";

    WelcomeCommand(MessageService messageService) {
        super(messageService);
    }

    @Override
    public List<BotApiMethodMessage> execute(long chatId) {
        return List.of(new SendMessage(String.valueOf(chatId), DEFAULT_MESSAGE));
    }
}
