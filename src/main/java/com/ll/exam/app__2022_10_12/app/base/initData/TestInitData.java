package com.ll.exam.app__2022_10_12.app.base.initData;

import com.ll.exam.app__2022_10_12.app.member.service.MemberService;
import com.ll.exam.app__2022_10_12.app.song.service.SongService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//테스트환경용
@Configuration
@Profile("test")
public class TestInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(MemberService memberService, SongService songService) {
        return args -> {
            before(memberService, songService);
        };
    }
}