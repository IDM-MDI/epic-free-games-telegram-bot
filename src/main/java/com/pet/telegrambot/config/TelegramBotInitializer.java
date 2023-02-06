package com.pet.telegrambot.config;

import com.pet.telegrambot.service.TelegramService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
@RequiredArgsConstructor
public class TelegramBotInitializer {
    private final TelegramService service;

    @SneakyThrows
    @EventListener(ContextRefreshedEvent.class)
    public void init() {
        TelegramBotsApi botSession = new TelegramBotsApi(DefaultBotSession.class);
        botSession.registerBot(service);
    }
}
