package com.cskt.itripauth;

import com.cskt.entity.ItripUser;
import com.cskt.service.ItripUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ItripAuthApplicationTests {
    @Resource
    private ItripUserService itripUserService;
    @Test
    void contextLoads() {
        itripUserService.removeById(12);

    }
    @Test
    void testfind(){
        List<ItripUser> itripUsers = itripUserService.list();
        for (ItripUser itripUser:itripUsers) {
            System.out.println(itripUser);
        }
    }
}
