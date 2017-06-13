package com.zhmgame.adminbj.dao;

import com.zhmgame.adminbj.entity.Book;
import com.zhmgame.adminbj.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * User dao
 */
public interface UserDao {
    /**
     * 根据用户的id来查询用户的信息
     * @param id 用户的id
     * @return 用户信息
     */
    User queryById(Integer id) throws Exception;

    /**
     *  一个分页查询的方式来对数据进行查询
     * @param offset 开始的位置，就是页码数*行
     * @param limit 结束的位置
     * @return 条件查询的一页数据
     */
    List<User> queryList(@Param("offset") int offset,  @Param("limit") int limit) throws Exception;

    /**
     * 一级代理和二级代理对用户进行钻石增加的操作
     * @param userId 目标用户的id
     * @param diamond 所需要给出的数量
     * @return 是否正确完成
     */
    boolean addDiamondById(@Param("userId") Integer userId, @Param("diamond") Integer diamond) throws Exception;

    /**
     * 查询代理的购买记录总数
     * @return 代理商的购买记录
     */
    int getCount();
}
