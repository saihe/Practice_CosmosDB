package ksaito.practice.cosmosdb.presentation.controller;

import ksaito.practice.cosmosdb.presentation.response.UserResponse;
import ksaito.practice.cosmosdb.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public ResponseEntity<UserResponse> get(@PathVariable String id) {
    return ResponseEntity.ok(UserResponse.FromEntity(userService.get(id)));
  }
}
