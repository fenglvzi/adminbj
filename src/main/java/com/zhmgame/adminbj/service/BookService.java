package com.zhmgame.adminbj.service;

import com.zhmgame.adminbj.dto.AppointExecution;
import com.zhmgame.adminbj.entity.Book;

import java.util.List;

/**
 * Created by 张译文 on 2017/6/10.
 */
public interface BookService {
    /**
     * 单个查询
     * @param id
     * @return 查询的图书信息
     */
    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(Integer bookId, Integer studentId);
}
