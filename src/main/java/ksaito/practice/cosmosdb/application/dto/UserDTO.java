package ksaito.practice.cosmosdb.application.dto;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "user")
public record UserDTO (
  String id,
  String userCode,
  String mailAddress,
  String userLastName,
  String userFirstName
) {}
