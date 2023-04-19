package ksaito.practice.cosmosdb.infrastructure.query;

import java.util.List;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import ksaito.practice.cosmosdb.application.dto.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuery extends CosmosRepository<UserDTO, String> {
  @Query("select c.id, c.userCode, c.mailAddress, c.userLastName, c.userFirstName from c where c.id = @id")
  List<UserDTO> getById(String id);
}
