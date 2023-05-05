package com.example.openai.application.dto;

import com.example.openai.domain.chat.Usage;
import com.example.openai.domain.chat.Choice;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class ChatResponse implements Serializable {

    private String id;
    private String object;
    private LocalDate created;
    private String model;
    private Usage usage;
    private List<Choice> choices;
}