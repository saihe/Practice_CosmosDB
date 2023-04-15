package ksaito.practice.cosmosdb.domain.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import ksaito.practice.cosmosdb.domain.entity.User;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User, String> {
}
