package com.example.chat.infrastructure;

import com.example.chat.application.dto.ChatRequest;
import com.example.chat.application.dto.ChatResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "chat", url = "https://api.openai.com/v1/")
public interface ChatClient {

    @Headers("Content-Type: application/json")
    @PostMapping("/chat/completions")
    ChatResponse chatCompletions(@RequestHeader("Authorization") String apiKey, ChatRequest request);
}