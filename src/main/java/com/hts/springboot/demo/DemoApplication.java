package com.hts.springboot.demo;

import com.hts.springboot.demo.annotation.EnableEhco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEhco(packages={"com.hts.springboot.demo.bo"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

