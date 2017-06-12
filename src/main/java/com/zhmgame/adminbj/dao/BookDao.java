package com.zhmgame.adminbj.dao;

import com.zhmgame.adminbj.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 张译文 on 2017/6/10.
 */
public interface BookDao {
    /**
     * 单体通过 ID查询书本信息
     * @param id
     * @return
     */
    Book queryById(Integer id);

    /**
     * 查询所有的图书
     * @param offset 起始位置
     * @param limit 条数
     * @return
     */
    List<Book> queryList(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少的馆藏数量
     * @param bookId
     * @return 如果影响的行数>=1，表示更新的记录行数
     */
    int reduceNumber(Integer bookId);
}
