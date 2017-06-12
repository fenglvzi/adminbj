package com.zhmgame.adminbj.dto;

/**
 * Created by 张译文 on 2017/6/12.
 */
public class Result<T> {
    private boolean success;
    private T data;
    private String error;

    public Result(){}

    /**
     * 成功预约类
     * @param success 预约结果
     * @param data 数据类型
     */
    public Result(boolean success, T data) {
        this.success=success;
        this.data = data;
    }
    /**
     * 预约失败类
     * @param success 预约结果
     * @param error 失败的返回值
     */
    public Result(boolean success, String error) {
        this.success=success;
        this.error = error;
    }
}
