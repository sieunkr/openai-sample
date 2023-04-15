package com.example.chatgpt.client;

import com.example.chatgpt.service.dto.ChatGPTRequest;
import com.example.chatgpt.service.dto.ChatGPTResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "chatgpt", url = "https://api.openai.com/v1/")
public interface ChatGPTClient {

    @Headers("Content-Type: application/json")
    @PostMapping("/chat/completions")
    ChatGPTResponse chatCompletions(@RequestHeader("Authorization") String apiKey, ChatGPTRequest request);
}