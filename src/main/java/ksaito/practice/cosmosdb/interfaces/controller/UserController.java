package ksaito.practice.cosmosdb.interfaces.controller;

import ksaito.practice.cosmosdb.interfaces.request.UserPostRequest;
import ksaito.practice.cosmosdb.interfaces.response.UserResponse;
import ksaito.practice.cosmosdb.application.usecase.UserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
  @Autowired
  private UserUseCase userUseCase;

  @GetMapping("/{id}")
  public ResponseEntity<UserResponse> get(@PathVariable String id) {
    return ResponseEntity.ok(UserResponse.FromDTO(userUseCase.get(id)));
  }

  @PostMapping("/")
  public ResponseEntity<Void> post(@RequestBody UserPostRequest requestBody) {
    userUseCase.save(requestBody);
    return ResponseEntity.noContent().build();
  }
}
