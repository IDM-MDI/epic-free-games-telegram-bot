package com.pet.telegrambot.service;

import com.pet.telegrambot.validator.UpdateValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service
public class TelegramService extends TelegramLongPollingBot {

    private final String name;

    private final String token;

    public TelegramService(@Value("${bot.name}") String name,
                           @Value("${bot.token}") String token) {
        this.name = name;
        this.token = token;
    }

    @Override
    public String getBotUsername() {
        return name;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(UpdateValidator.hasNoMessage(update)) {
            return;
        }
        System.out.println();
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        super.onUpdatesReceived(updates);
    }
}
