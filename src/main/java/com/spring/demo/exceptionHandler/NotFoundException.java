package com.spring.demo.exceptionHandler;

public class NotFoundException extends RuntimeException{
  public NotFoundException(String message) {
    super(message);
  }
}
