package ksaito.practice.cosmosdb.presentation.controller;

import java.lang.management.ManagementFactory;

import ksaito.practice.cosmosdb.application.usecase.MyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  @Autowired
  private MyUseCase myUseCase;

  public MyController() {
    System.out.println("コントローラー誕生");
  }

  @GetMapping("/")
  public ResponseEntity<String> get() throws InterruptedException {
    System.out.println(ManagementFactory.getRuntimeMXBean().getPid());
    return ResponseEntity.ok(myUseCase.serve());
  }

  public void dispose() {
    System.out.println("コントローラー死亡");
  }

}
