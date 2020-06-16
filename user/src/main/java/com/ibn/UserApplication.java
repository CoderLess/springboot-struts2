package com.ibn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(UserApplication.class, args);
        while (true) {
            Thread.sleep(1000);
        }
    }

}
