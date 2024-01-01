package com.spring.demo.service;

import com.spring.demo.User;
import com.spring.demo.exceptionHandler.NotFoundException;
import com.spring.demo.mapper.UserMapper;
import com.spring.demo.model.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
  private static ArrayList<User> users = new ArrayList<>();

  static {
    users.add(new User(1, "one", "a.@g.com", "123"));
    users.add(new User(2, "two", "b.@g.com", "456"));
    users.add(new User(3, "three", "c.@g.com", "789"));
  }

  @Override
  public List<UserDto> getListUser() {
    List<UserDto> userDtos = new ArrayList<>();
    for (User u : users) {
      userDtos.add(UserMapper.convertToUserDto(u));
    }
    return userDtos;
  }

  @Override
  public UserDto getUserById(int id) {
    for (User u : users) {
      if (u.getId() == id) {
        return UserMapper.convertToUserDto(u);
      }
    }
    throw new NotFoundException("user does not exist");
  }

  @Override
  public List<UserDto> searchUser(String keyword) {
    List<UserDto> userDtos = new ArrayList<>();
    for (User u : users) {
      if (u.getName().equalsIgnoreCase(keyword)) {
       userDtos.add(UserMapper.convertToUserDto(u));
      }
    }
    return userDtos;
  }
}
