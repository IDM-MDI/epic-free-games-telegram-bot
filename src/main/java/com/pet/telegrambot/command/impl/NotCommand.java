package com.pet.telegrambot.command.impl;

import com.pet.telegrambot.command.TelegramCommand;
import com.pet.telegrambot.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class NotCommand extends TelegramCommand {

    public NotCommand(MessageService messageService) {
        super(messageService);
    }

    @Override
    public void execute() {

    }
}
