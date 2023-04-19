package ksaito.practice.cosmosdb.interfaces.request;

public record UserPostRequest(
  String userCode,
  String mailAddress,
  String lastName,
  String firstName
) {
}
