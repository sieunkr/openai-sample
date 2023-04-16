package com.example.openai.application.dto;

import com.example.openai.domain.image.Image;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ImageResponse implements Serializable {

    private long created;
    private List<Image> data;
}