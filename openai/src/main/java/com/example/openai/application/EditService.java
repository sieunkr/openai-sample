package com.example.openai.application;

import com.example.openai.application.dto.EditRequest;
import com.example.openai.infrastructure.EditClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditService {

    private final EditClient editClient;
    private final static String ROLE_USER = "user";
    private final static String MODEL = "text-davinci-edit-001";

    @Value("${apikey}")
    private String apiKey;

    public String edit() {

        EditRequest editRequest = EditRequest.builder().model(MODEL).input("만나서 반고워!").instruction("Fix the spelling mistakes").build();

        return editClient.edit(apiKey, editRequest).getChoices().stream().findFirst().orElseThrow().getText();
    }
}