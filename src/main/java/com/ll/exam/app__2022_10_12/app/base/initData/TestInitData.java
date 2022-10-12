package com.ll.exam.app__2022_10_12.app.base.initData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//테스트환경용
@Configuration
@Profile("test")
public class TestInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData() {
        return args -> {
            before();
        };
    }
}