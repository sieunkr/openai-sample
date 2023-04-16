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
public class ImageRequest implements Serializable {

    private String prompt;
    private Integer n;
    private String size;

    //String responseFormat;
    //String user;
}
