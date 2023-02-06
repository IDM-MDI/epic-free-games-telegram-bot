package com.pet.telegrambot.service;

import com.pet.telegrambot.command.TelegramCommandFactory;
import com.pet.telegrambot.config.BotAuth;
import com.pet.telegrambot.validator.UpdateValidator;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethodMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TelegramService extends TelegramLongPollingBot {
    private final TelegramCommandFactory commandFactory;
    private final BotAuth botAuth;
    @Override
    public String getBotUsername() {
        return botAuth.getName();
    }

    @Override
    public String getBotToken() {
        return botAuth.getToken();
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        if(UpdateValidator.hasNoMessage(update)) {
            return;
        }
        List<BotApiMethodMessage> messages = commandFactory.createCommand(update.getMessage().getText())
                .execute(update.getMessage().getChatId());
        execute(messages);
    }
    private void execute(List<BotApiMethodMessage> messages) throws TelegramApiException {
        for (BotApiMethodMessage message : messages) {
            execute(message);
        }
    }
}
