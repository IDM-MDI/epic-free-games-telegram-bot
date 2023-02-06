package com.pet.telegrambot.command.impl;

import com.pet.telegrambot.command.TelegramCommand;
import com.pet.telegrambot.service.MessageService;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethodMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

@Component("notCommand")
public class NotCommand extends TelegramCommand {
    private static final String DEFAULT_MESSAGE = "This command doesn't exist. Please click on the menu and see existing one";
    public NotCommand(MessageService messageService) {
        super(messageService);
    }

    @Override
    public List<BotApiMethodMessage> execute(long chatId) {
        return List.of(new SendMessage(String.valueOf(chatId),DEFAULT_MESSAGE));
    }
}
