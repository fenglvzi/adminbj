package com.zhmgame.adminbj.service;

import com.zhmgame.adminbj.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户的业务
 */
public interface UserService {
    /**
     * 单个查询
     * @param id
     * @return 查询的图书信息
     */
    User getById(Integer id) throws Exception;

    /**
     * 查询所有
     * @return
     */
    List<User> getList(int offset, int limit ) throws Exception;

    /**
     * 代理卖卡操作
     * @param userId
     * @return
     */
    boolean addDiamondById(@Param("userId") Integer userId, @Param("diamond") Integer diamond ) throws Exception;
}
