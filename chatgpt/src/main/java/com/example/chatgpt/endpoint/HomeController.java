package com.example.chatgpt.endpoint;

import com.example.chatgpt.service.ChatService;
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

    private final ChatService chatService;

    @GetMapping("/chat")
    public String chat(@RequestParam(value="q") String question){

        if(!StringUtils.hasLength(question)) {
            throw new RuntimeException();
        }

        return chatService.chatCompletions(question);
    }
}