package ksaito.practice.cosmosdb.application.usecase;

import ksaito.practice.cosmosdb.application.dto.UserDTO;
import ksaito.practice.cosmosdb.domain.User;
import ksaito.practice.cosmosdb.interfaces.request.UserPostRequest;

public interface UserUseCase {
  UserDTO get(String id);
  User save(UserPostRequest request);
}
