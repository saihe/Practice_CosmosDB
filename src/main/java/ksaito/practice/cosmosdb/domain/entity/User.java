package ksaito.practice.cosmosdb.domain.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import lombok.Data;
import lombok.ToString;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

/**
 * ユーザーコンテナ
 */
@Container(containerName = "user")
@Data
public class User extends Base {
  @Id
  private String id;
  private String mailAddress;
  private String userCode;
  private String userLastName;
  private String userFirstName;
  private String passphrase;
  private String divisionCode;
  private String createdAt;
  private String updatedAt;
}
