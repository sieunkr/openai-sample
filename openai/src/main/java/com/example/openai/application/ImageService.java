package com.example.openai.application;

import com.example.openai.application.dto.ImageRequest;
import com.example.openai.application.dto.ImageResponse;
import com.example.openai.infrastructure.ImageClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageClient imageClient;

    @Value("${apikey}")
    private String apiKey;

    public String createImage() {

        ImageRequest request = ImageRequest.builder()
                .prompt("a Korean country dog")
                .n(1)
                .size("1024x1024")
                .build();

        return imageClient.createImage(apiKey, request).getData().stream().findFirst().orElseThrow().getUrl();
    }
}
