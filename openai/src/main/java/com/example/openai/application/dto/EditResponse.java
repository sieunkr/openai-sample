package com.example.openai.application.dto;

import com.example.openai.domain.chat.ChatUsage;
import com.example.openai.domain.edit.EditChoice;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class EditResponse implements Serializable {

    private String object;
    private LocalDate created;
    private List<EditChoice> choices;
    private ChatUsage chatUsage;

}