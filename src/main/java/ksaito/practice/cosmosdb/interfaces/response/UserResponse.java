package ksaito.practice.cosmosdb.interfaces.response;

import ksaito.practice.cosmosdb.application.dto.UserDTO;
import ksaito.practice.cosmosdb.domain.User;

public record UserResponse(
  String id,
  String userCode,
  String mailAddress,
  String lastName,
  String firstName,
  String fullName
) {
  public static UserResponse FromDTO(UserDTO dto) {
    return new UserResponse(
      dto.id(),
      dto.userCode(),
      dto.mailAddress(),
      dto.userLastName(),
      dto.userFirstName(),
      String.format("%s %s", dto.userLastName(), dto.userFirstName())
    );
  }
}
