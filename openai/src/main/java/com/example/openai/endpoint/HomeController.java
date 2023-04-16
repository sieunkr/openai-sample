package com.example.openai.endpoint;

import com.example.openai.application.ChatCompletionService;
import com.example.openai.application.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HomeController {

    private final ChatCompletionService chatCompletionService;
    private final ImageService imageService;

    @GetMapping("/chat")
    public String chat(@RequestParam(value="q") String question){

        if(!StringUtils.hasLength(question)) {
            throw new RuntimeException();
        }

        return chatCompletionService.chatCompletions(question);
    }
    
    @GetMapping("/image")
    public String image() {

        return imageService.createImage();
    }
}