package ksaito.practice.cosmosdb.infrastructure.command;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import ksaito.practice.cosmosdb.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCommand extends ReactiveCosmosRepository<User, String> {
}
