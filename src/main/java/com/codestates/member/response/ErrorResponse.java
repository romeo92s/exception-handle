package com.codestates.member.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.validation.FieldError;

import java.util.List;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private List<FieldError> fieldErrors;

    @Getter
    @AllArgsConstructor
    public static class FieldError{
        private String field;
        private Object rejectedValue; //거절된 값
        private String reason;
    }
}
