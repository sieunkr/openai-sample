package com.example.openai.domain.chat;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ChatMessage implements Serializable {

    private String role;

    private String content;
}