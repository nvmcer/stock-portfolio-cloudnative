package com.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.RegisterRequest;
import com.user.dto.UserResponseDto;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

  @Autowired
  private final UserService userService;

  public AuthController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
    try {
      User saved = userService.register(request.getUsername(), request.getPassword());
      return ResponseEntity.ok(new UserResponseDto(saved.getId(), saved.getUsername()));
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
    }

  }
}