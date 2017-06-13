package com.zhmgame.adminbj.service;

import com.zhmgame.adminbj.dao.UserDao;
import com.zhmgame.adminbj.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User getById(Integer id) throws Exception{
        return userDao.queryById(id);
    }

    public List<User> getList(int offset, int limit) throws Exception {
        return userDao.queryList(offset,limit);
    }

    /**
     * 代理商的操作。对用户添加钻石，
     * @param userId 目标用户的id
     * @param diamond 发放的钻石数量
     * @return 是否添加成功
     * @throws Exception
     */
    @Transactional
    public boolean addDiamondById(@Param("userId") Integer userId, @Param("diamond") Integer diamond) throws Exception {
        return userDao.addDiamondById(userId,diamond);
    }
}
