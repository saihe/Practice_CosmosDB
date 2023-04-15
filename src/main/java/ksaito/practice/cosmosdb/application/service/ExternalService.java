package ksaito.practice.cosmosdb.application.service;

import org.springframework.web.client.RestTemplate;

public interface ExternalService {
  RestTemplate restTemplate();
}
