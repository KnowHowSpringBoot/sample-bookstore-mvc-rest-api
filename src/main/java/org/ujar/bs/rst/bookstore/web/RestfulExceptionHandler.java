package org.ujar.bs.rst.bookstore.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.ujar.boot.starter.restful.web.DefaultRestfulErrorHandler;
import org.ujar.bs.rst.bookstore.exception.EntityNotFoundException;
import org.ujar.bs.rst.bookstore.web.dto.ErrorResponse;

@RestControllerAdvice
public class RestfulExceptionHandler extends DefaultRestfulErrorHandler {

  @ExceptionHandler(EntityNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ErrorResponse entityNotFoundException(EntityNotFoundException exception) {
    return ErrorResponse.singleError(exception);
  }
}