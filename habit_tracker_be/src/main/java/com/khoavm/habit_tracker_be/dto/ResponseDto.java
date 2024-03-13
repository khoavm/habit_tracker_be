package com.khoavm.habit_tracker_be.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Setter
@Getter
@Builder
public class ResponseDto {
    private int statusCode;
    private String message;
    private Object data;
    public static ResponseDto DefaultCreateSuccessResponse(Object data){
        return ResponseDto.builder().statusCode(201)
                .message("create successfully")
                .data(data).build();
    }
    public static ResponseDto DefaultSuccessResponse(Object data){
        return ResponseDto.builder().statusCode(200)
                .message("success")
                .data(data).build();
    }
}
