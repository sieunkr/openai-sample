package com.example.openai.application.dto;

import com.example.openai.domain.chat.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRequest implements Serializable {

    private String model;
    private List<Message> messages;
}