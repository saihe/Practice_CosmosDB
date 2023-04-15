package ksaito.practice.cosmosdb.presentation.response;

public record UserResponse(
  String id,
  String userCode,
  String mailAddress,
  String lastName,
  String firstName,
  String fullName
) {
  public static UserResponse FromEntity(ksaito.practice.cosmosdb.domain.entity.User entity) {
    return new UserResponse(
      entity.getId(),
      entity.getUserCode(),
      entity.getMailAddress(),
      entity.getUserLastName(),
      entity.getUserFirstName(),
      entity.getUserFirstName() + " " + entity.getUserLastName()
    );
  }
}
