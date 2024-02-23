package com.workintech.sp18d2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<PlantErrorResponse> handleException(PlantException plantException){
        PlantErrorResponse plantErrorResponse = new PlantErrorResponse(plantException.getMessage(), plantException.getHttpStatus().value(),System.currentTimeMillis());
        return new ResponseEntity<>(plantErrorResponse,plantException.getHttpStatus());
    };
    @ExceptionHandler
    public ResponseEntity<PlantErrorResponse> handleException(Exception exception){
        PlantErrorResponse plantErrorResponse=new PlantErrorResponse(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.value(),System.currentTimeMillis());
        return new ResponseEntity<>(plantErrorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
