package com.pet.telegrambot.command;

import com.pet.telegrambot.service.MessageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethodMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class TelegramCommand {
    private final MessageService messageService;
    public abstract List<BotApiMethodMessage> execute(long chatId);
}
