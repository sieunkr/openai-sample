package com.example.openai.infrastructure;

import com.example.openai.application.dto.ChatRequest;
import com.example.openai.application.dto.ChatResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "chat", url = "https://api.openai.com/v1/")
public interface ChatCompletionClient {

    @Headers("Content-Type: application/json")
    @PostMapping("/chat/completions")
    ChatResponse chatCompletions(@RequestHeader("Authorization") String apiKey, ChatRequest request);
}