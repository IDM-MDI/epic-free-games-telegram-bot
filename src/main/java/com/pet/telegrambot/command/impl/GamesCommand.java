package com.pet.telegrambot.command.impl;

import com.pet.telegrambot.command.TelegramCommand;
import com.pet.telegrambot.service.MessageService;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethodMessage;

import java.util.List;

@Component("gamesCommand")
public class GamesCommand extends TelegramCommand {
    GamesCommand(MessageService messageService) {
        super(messageService);
    }

    @Override
    public List<BotApiMethodMessage> execute(long chatId) {
        return null;
    }
}