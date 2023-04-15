package com.example.chatgpt.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Usage implements Serializable {

    @JsonProperty("prompt_tokens")
    private String promptTokens;

    @JsonProperty("completion_tokens")
    private String completionTokens;

    @JsonProperty("total_tokens")
    private String totalTokens;

    /*
    prompt_tokens: 모델에 제공된 입력 텍스트를 구성하는 토큰의 개수, 모델이 이전 텍스트를 이해하고 다음 단어를 생성하는 데 사용하는 기본 텍스트
    completion_tokens: 모델에서 생성된 출력 텍스트를 구성하는 토큰의 개수, 모델이 생성한 텍스트
    total_tokens: 모델에서 생성된 전체 텍스트의 토큰 수, 입력 텍스트와 출력 텍스트의 토큰 수의 합, 이 값은 모델의 작동 방식과 출력 텍스트의 길이를 이해하는 데 도움이 됨
     */
}