package com.spring.demo.testBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {
  public Outfit outfit;

  @Autowired
  public GirlFriend(@Qualifier("shirt") Outfit outfit) {
    this.outfit = outfit;
  }

  public Outfit getOutfit() {
    return outfit;
  }

  public void setOutfit(Outfit outfit){
    this.outfit = outfit;
  }
}
