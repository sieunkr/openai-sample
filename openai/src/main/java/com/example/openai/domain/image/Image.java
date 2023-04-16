package com.example.openai.domain.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Image implements Serializable {

    private String url;

    @JsonProperty("b64_json")
    private String b64Json;
}
