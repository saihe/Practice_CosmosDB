package ksaito.practice.cosmosdb.application.usecase.implement;

import ksaito.practice.cosmosdb.application.dto.UserDTO;
import ksaito.practice.cosmosdb.application.usecase.UserUseCase;
import ksaito.practice.cosmosdb.domain.User;
import ksaito.practice.cosmosdb.infrastructure.query.UserQuery;
import ksaito.practice.cosmosdb.infrastructure.command.UserCommand;
import ksaito.practice.cosmosdb.interfaces.request.UserPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserUseCaseImpl implements UserUseCase {
  @Autowired
  private UserCommand userCommand;
  @Autowired
  private UserQuery userQuery;

  @Override
  public UserDTO get(String id) {
//    return userQuery.getById(id).get(0);
    return userQuery.findById(id).get();
  }

  @Override
  public User save(UserPostRequest request) {
    return userCommand.save(
      User.builder()
        .mailAddress(request.mailAddress())
        .userCode(request.userCode())
        .userFirstName(request.firstName())
        .userLastName(request.lastName())
        .build()
    ).block();
  }
}
