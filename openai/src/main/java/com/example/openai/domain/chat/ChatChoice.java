package com.example.openai.domain.chat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChatChoice implements Serializable {

    private Integer index;

    private ChatMessage chatMessage;

    @JsonProperty("finish_reason")
    private String finishReason;
}