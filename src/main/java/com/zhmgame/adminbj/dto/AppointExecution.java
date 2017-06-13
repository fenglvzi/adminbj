package com.zhmgame.adminbj.dto;

import com.zhmgame.adminbj.core.enums.AppointStateEnum;
import com.zhmgame.adminbj.entity.Appointment;

/**
 *
 */
public class AppointExecution {
    public static void main(String[] args) {
        AppointExecution appointExecution = new AppointExecution(1,AppointStateEnum.REPEAT_APPOINT);
        System.out.println(appointExecution);
    }
    private Integer bookId;
    private int state;
    private String stateInfo;
    private Appointment appointment;

    public AppointExecution() {
    }

    /**
     * 预约失败时的构造函数
     * @param bookId 图书的id
     * @param appointStateEnum 图书的状态码
     */
    public AppointExecution(Integer bookId, AppointStateEnum appointStateEnum) {
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo=appointStateEnum.getStateInfo();
    }

    /**
     * 预约成功时的构造函数
     * @param bookId 图书的id
     * @param appointStateEnum 图书的状态码
     * @param appointment
     */
    public AppointExecution(Integer bookId, AppointStateEnum appointStateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo=appointStateEnum.getStateInfo();
        this.appointment=appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
