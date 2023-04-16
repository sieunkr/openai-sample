package com.example.openai.infrastructure;

import com.example.openai.application.dto.ImageRequest;
import com.example.openai.application.dto.ImageResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "image", url = "https://api.openai.com/v1/")
public interface ImageClient {

    @Headers("Content-Type: application/json")
    @PostMapping("/images/generations")
    ImageResponse createImage(@RequestHeader("Authorization") String apiKey, ImageRequest request);
}