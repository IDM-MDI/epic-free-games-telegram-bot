package com.pet.telegrambot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BotAuth {
    private String name;
    private String token;
}
