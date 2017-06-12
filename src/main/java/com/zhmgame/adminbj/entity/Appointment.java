package com.zhmgame.adminbj.entity;

import java.util.Date;

/**
 * Created by 张译文 on 2017/6/10.
 * 预约类，对书本和学生的时间和学号进行绑定，并且保存预约的时间
 */
public class Appointment {
    private Integer bookId;//图书id
    private Integer studentId;//学号
    private Date appointTime;

    private Book book;
    public Appointment(){}
    public Appointment(Integer bookId, Integer studentId, Date appointTime, Book book) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.appointTime = appointTime;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointTime=" + appointTime +
                ", book=" + book +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
