package com.zhmgame.adminbj.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类，user信息
 */
public class User implements Serializable {
    private Integer userId;
    private String username;
    private int diamond;
    private int level;
    private Date date;

    public User() {
    }

    public User(Integer userId, String username, int diamond, int level, Date date) {
        this.userId = userId;
        this.username = username;
        this.diamond = diamond;
        this.level = level;
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", diamond=" + diamond +
                ", level=" + level +
                ", date=" + date +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
