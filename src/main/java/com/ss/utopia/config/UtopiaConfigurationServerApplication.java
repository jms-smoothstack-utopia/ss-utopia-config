package com.ss.utopia.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class UtopiaConfigurationServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(UtopiaConfigurationServerApplication.class, args);
  }

}
