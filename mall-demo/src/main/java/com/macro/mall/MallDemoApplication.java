package com.macro.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * refer doc: https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-using-springbootapplication-annotation.html
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MallDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallDemoApplication.class, args);
    }
}
