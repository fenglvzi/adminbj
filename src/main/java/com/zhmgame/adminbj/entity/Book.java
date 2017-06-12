package com.zhmgame.adminbj.entity;

import java.io.Serializable;

/**
 * Created by 张译文 on 2017/6/10.
 * 测试用实体类
 */
public class Book implements Serializable{
    private Integer bookId;//图书ID
    private String name;//书名
    private Integer number;//数量

    public Book() {
    }

    public Book(Integer booId, String name, Integer number) {
        this.bookId = booId;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
