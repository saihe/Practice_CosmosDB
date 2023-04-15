package ksaito.practice.cosmosdb.application.service;


public interface MyService {
  String serve();
  String async() throws InterruptedException;
}
