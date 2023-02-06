package com.pet.telegrambot.command;

import com.pet.telegrambot.service.MessageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class TelegramCommand {
    private final MessageService messageService;
    public abstract void execute();

}
