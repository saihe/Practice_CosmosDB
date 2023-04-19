package ksaito.practice.cosmosdb.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.azure.spring.data.cosmos.core.mapping.Container;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 * ユーザーコンテナ
 */
@Container(containerName = "user")
@Data
@EqualsAndHashCode(callSuper=false)
@Builder
public class User extends Base {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
