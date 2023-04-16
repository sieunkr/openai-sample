package com.example.openai.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditRequest implements Serializable {

    private String model;
    private String input;
    private String instruction;

    //n, temperature, top_p
}