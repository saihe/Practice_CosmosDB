package ksaito.practice.cosmosdb.application.usecase;

import org.springframework.web.client.RestTemplate;

public interface ExternalUseCase {
  RestTemplate restTemplate();
}
