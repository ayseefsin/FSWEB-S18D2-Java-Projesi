package com.workintech.sp18d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class PlantErrorResponse {
    private String message;
    private int status;
    private long timestamp;
}
