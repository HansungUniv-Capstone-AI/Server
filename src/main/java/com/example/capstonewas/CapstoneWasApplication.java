package com.example.capstonewas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing // Jpa Auditing을 활성화
public class CapstoneWasApplication {


    public static void main(String[] args) {
        SpringApplication.run(CapstoneWasApplication.class, args);
    }

    // 스프링은 PasswordEncoder를 bean 으노 인식하지 못하기 때문에 직접 등록
    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
