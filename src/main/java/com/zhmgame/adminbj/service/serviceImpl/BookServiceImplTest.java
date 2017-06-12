package com.zhmgame.adminbj.service.serviceImpl;

import com.zhmgame.adminbj.core.base.BaseTest;
import com.zhmgame.adminbj.dto.AppointExecution;
import com.zhmgame.adminbj.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 张译文 on 2017/6/10.
 */
public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        Integer id = 1001;
        Integer studentId=123456;
        AppointExecution execution = bookService.appoint(id, studentId);
        System.out.println(execution);
    }
}
