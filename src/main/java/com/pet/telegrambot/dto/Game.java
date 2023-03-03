package com.pet.telegrambot.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
@ToString
public abstract class Game {
    private String name;
    private String description;
    private String gameUrl;
    private String imgUrl;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
