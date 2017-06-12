package com.zhmgame.adminbj.core.base;

import com.zhmgame.adminbj.dao.BookDao;
import com.zhmgame.adminbj.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 张译文 on 2017/6/10.
 */
public class BaseDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;
    @Test
    public void testQueryById()throws Exception{
        Integer id=1001;
        Book book = bookDao.queryById(id);
        System.out.println(book);
    }

}
