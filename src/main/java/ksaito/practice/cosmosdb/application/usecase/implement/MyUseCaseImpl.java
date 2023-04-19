package ksaito.practice.cosmosdb.application.usecase.implement;

import ksaito.practice.cosmosdb.application.usecase.MyUseCase;
import ksaito.practice.cosmosdb.application.usecase.ExternalUseCase;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyUseCaseImpl implements MyUseCase {
  @Autowired
  private ExternalUseCase externalUseCase;

  @Override
  public String serve() {
    val restTemplate = externalUseCase.restTemplate();
    val res = restTemplate.exchange(
      "https://weather.tsukumijima.net/api/forecast/city/400040",
      HttpMethod.GET,
      null,
      String.class
    );

    return res.toString();
  }

  @Override
  public String async() throws InterruptedException {
    val thread1 = new MyThread();
    thread1.run("スレッド１", 4);
    val thread2 = new MyThread();
    thread2.run("スレッド２", 1);

    thread1.join();
    thread2.join();
    thread1.stop();
    thread2.stop();
    return null;
  }

  public void dispose() {
    System.out.println("サービス死亡");
  }

  private class MyThread extends Thread {
    /**
     * カスタム
     */
    @Async
    @SneakyThrows
    public void run(String name, long sleep) {
      System.out.println(name);
      System.out.println(this.getId());
      System.out.println(this.getName());
      System.out.println(this.getClass().getName());

      System.out.println(this.getName()+"sleepを始めます");

      Thread.sleep(sleep*1000);

      System.out.println(this.getName()+"sleepが終わりました");
    }
  }
}
