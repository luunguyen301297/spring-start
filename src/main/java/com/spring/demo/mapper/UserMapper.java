package com.spring.demo.mapper;

import com.spring.demo.User;
import com.spring.demo.model.dto.UserDto;

public class UserMapper {
  public static UserDto convertToUserDto(User user) {
    UserDto tmp = new UserDto();
    tmp.setId(user.getId());
    tmp.setName(user.getName());
    tmp.setEmail(user.getEmail());
    return tmp;
  }
}
