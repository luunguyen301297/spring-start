package com.spring.demo.testBeanScope;

import org.springframework.stereotype.Component;

@Component("dress")
public class Dress implements Outfit {
  @Override
  public void wear() {
    System.err.println("Đang mặc váy");
  }
}
