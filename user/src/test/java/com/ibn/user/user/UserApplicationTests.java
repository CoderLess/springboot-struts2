package com.ibn.user.user;

import com.ibn.user.domain.UserBaseDTO;
import com.ibn.user.controller.UserBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {
    @Autowired
    private UserBaseService userBaseService;
    @Test
    void contextLoads() {
        UserBaseDTO userBaseDTO = new UserBaseDTO();
        userBaseDTO.setUsername("zhangsan");
        userBaseDTO.setPassword("123");
        userBaseDTO.setCreateTime(System.currentTimeMillis());
        userBaseDTO.setLastAccess(System.currentTimeMillis());
        userBaseDTO.setPhone("1310000000");
        userBaseDTO.setVersion(0L);
        userBaseService.createUserBase(userBaseDTO);
    }

}
