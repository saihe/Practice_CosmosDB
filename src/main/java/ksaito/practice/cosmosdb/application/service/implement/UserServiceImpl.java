package ksaito.practice.cosmosdb.application.service.implement;

import ksaito.practice.cosmosdb.application.service.UserService;
import ksaito.practice.cosmosdb.domain.entity.User;
import ksaito.practice.cosmosdb.domain.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public User get(String id) {
    return userRepository.findById(id).block();
  }
}
