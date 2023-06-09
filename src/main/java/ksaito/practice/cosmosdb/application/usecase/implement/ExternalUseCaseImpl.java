package ksaito.practice.cosmosdb.application.usecase.implement;

import ksaito.practice.cosmosdb.application.usecase.ExternalUseCase;
import lombok.val;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalUseCaseImpl implements ExternalUseCase {
  public ExternalUseCaseImpl() {
    System.out.println("外部サービス誕生");
  }

  @Override
  public RestTemplate restTemplate() {
    val restTemplate = new RestTemplateBuilder().build();
    val factory = new SimpleClientHttpRequestFactory();
    factory.setConnectTimeout(3000);
    factory.setReadTimeout(3000);
    restTemplate.setRequestFactory(factory);

    return restTemplate;
  }

  public void dispose() {
    System.out.println("外部サービス死亡");
  }
}
