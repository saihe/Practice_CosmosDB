package ksaito.practice.cosmosdb.application.usecase;


public interface MyUseCase {
  String serve();
  String async() throws InterruptedException;
}
