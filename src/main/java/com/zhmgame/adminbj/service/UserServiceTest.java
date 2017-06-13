package com.zhmgame.adminbj.service;

import com.zhmgame.adminbj.core.base.BaseTest;
import com.zhmgame.adminbj.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 张译文 on 2017/6/12.
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserService userService;
    @Test
    public void testService() throws Exception {
        User byId = userService.getById(47);
        System.out.println(byId);
    }
    @Test
    public void testUpdate() throws Exception {
        boolean b = userService.addDiamondById(47, 500000);
        System.out.println("发放状态："+b);
        System.out.println(  userService.getById(47));
    }
}
