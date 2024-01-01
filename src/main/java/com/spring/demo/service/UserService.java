package com.spring.demo.service;

import com.spring.demo.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
  List<UserDto> getListUser();

  UserDto getUserById(int id);

  List<UserDto> searchUser(String keyword);
}
