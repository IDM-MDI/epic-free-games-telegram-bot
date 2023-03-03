package com.pet.telegrambot.config;

import com.pet.telegrambot.dto.BotAuth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class TelegramBotConfig {
    @Value("${bot.name}")
    private String name;
    @Value("${bot.token}")
    private String token;

    @Bean
    public BotAuth getBotAuthentication() {
        return new BotAuth(name,token);
    }
}
