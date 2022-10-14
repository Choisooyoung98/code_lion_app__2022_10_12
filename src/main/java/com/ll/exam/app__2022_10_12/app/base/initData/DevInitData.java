package com.ll.exam.app__2022_10_12.app.base.initData;

import com.ll.exam.app__2022_10_12.app.cart.service.CartService;
import com.ll.exam.app__2022_10_12.app.member.service.MemberService;
import com.ll.exam.app__2022_10_12.app.order.service.OrderService;
import com.ll.exam.app__2022_10_12.app.product.service.ProductService;
import com.ll.exam.app__2022_10_12.app.song.service.SongService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//개발환경용
@Configuration
@Profile("dev")
public class DevInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(
            MemberService memberService,
            SongService songService,
            ProductService productService,
            CartService cartService,
            OrderService orderService) {
        return args -> {
            before(memberService, songService, productService, cartService, orderService);
        };
    }
}