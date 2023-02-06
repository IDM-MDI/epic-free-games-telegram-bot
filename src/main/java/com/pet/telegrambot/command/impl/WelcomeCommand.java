package com.pet.telegrambot.command.impl;

import com.pet.telegrambot.command.TelegramCommand;
import com.pet.telegrambot.service.MessageService;
import org.springframework.stereotype.Component;

@Component("startCommand")
public class WelcomeCommand extends TelegramCommand {

    WelcomeCommand(MessageService messageService) {
        super(messageService);
    }

    @Override
    public void execute() {

    }
}
