package com.khoavm.habit_tracker_be.helper;

import com.khoavm.habit_tracker_be.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {
    public static  ResponseEntity<ResponseDto> DefaultCreateSuccessResponse(Object data){
        var responseBody = ResponseDto.builder().statusCode(HttpStatus.CREATED.value())
                .message("create successfully")
                .data(data).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);

    }
}
