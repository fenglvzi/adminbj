package com.zhmgame.adminbj.core.exception;

/**
 * Created by 张译文 on 2017/6/10.
 */
public class AppointException extends RuntimeException {
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message,cause);
    }
}
