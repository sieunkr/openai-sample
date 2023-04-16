package com.example.openai.infrastructure;

import com.example.openai.application.dto.ChatResponse;
import com.example.openai.application.dto.EditRequest;
import com.example.openai.application.dto.EditResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "edit", url = "https://api.openai.com/v1/")
public interface EditClient {

    @Headers("Content-Type: application/json")
    @PostMapping("/edits")
    EditResponse edit(@RequestHeader("Authorization") String apiKey, EditRequest request);
}
