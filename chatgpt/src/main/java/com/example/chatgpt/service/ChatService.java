package com.example.chatgpt.service;

import com.example.chatgpt.client.ChatGPTClient;
import com.example.chatgpt.domain.Message;
import com.example.chatgpt.service.dto.ChatGPTRequest;
import com.example.chatgpt.service.dto.ChatGPTResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatGPTClient chatGPTClient;
    private final static String ROLE_USER = "user";
    private final static String CHATGPT_MODEL = "gpt-3.5-turbo";

    @Value("${chatgpt.apikey}")
    private String chatGPTapiKey;

    public String chatCompletions(String question) {

        Message message = Message.builder()
                .role(ROLE_USER)
                .content(question)
                .build();

        ChatGPTRequest chatGPTRequest = ChatGPTRequest.builder()
                .model(CHATGPT_MODEL)
                .messages(Collections.singletonList(message))
                .build();

        ChatGPTResponse response = chatGPTClient.chatCompletions(chatGPTapiKey, chatGPTRequest);
        return response.getChoices().stream().findFirst().orElseThrow().toString();
    }
}