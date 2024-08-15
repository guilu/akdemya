package dev.diegobarrioh.akdmia.controller;

import dev.diegobarrioh.akdmia.exception.ErrorInfo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FrontEndControllerAdvice {

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    ErrorInfo unauthorized(HttpServletRequest request, Exception exception) {
        return new ErrorInfo(request.getRequestURI(),exception);
    }
}
