package com.example.openai.domain.edit;

import lombok.Data;

import java.io.Serializable;

@Data
public class EditChoice implements Serializable {

    private Integer index;

    private String text;

}