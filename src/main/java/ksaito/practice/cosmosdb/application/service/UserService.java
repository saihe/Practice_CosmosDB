package ksaito.practice.cosmosdb.application.service;

import ksaito.practice.cosmosdb.domain.entity.User;

public interface UserService {
  User get(String id);
}
