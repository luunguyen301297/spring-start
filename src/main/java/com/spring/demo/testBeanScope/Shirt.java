package com.spring.demo.testBeanScope;

import com.spring.demo.testBeanScope.Outfit;
import org.springframework.stereotype.Component;

@Component("shirt")
public class Shirt implements Outfit {
  @Override
  public void wear() {
    System.err.println("Đang mặc áo");
  }
}
