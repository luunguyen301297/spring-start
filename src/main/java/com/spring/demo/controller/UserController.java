package com.spring.demo.controller;

import com.spring.demo.model.dto.UserDto;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("")
  public ResponseEntity<?> getListUser() {
    List<UserDto> userDtos = userService.getListUser();
    return ResponseEntity.ok(userDtos);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getUserById(@PathVariable int id) {
    UserDto obj = userService.getUserById(id);
    return ResponseEntity.ok(obj);
  }

  @GetMapping("/search")
  public ResponseEntity<?> searchUser(@RequestParam(required = false) String keyword) {
    List<UserDto> userDtos = userService.searchUser(keyword);
    return ResponseEntity.ok(userDtos);
  }

  @PostMapping("")
  public ResponseEntity<?> createUser() {
    return null;
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateUser() {
    return null;
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteUser() {
    return null;
  }
}
