package com.zhmgame.adminbj.core.exception;

/**
 * Created by 张译文 on 2017/6/10.
 */
public class NoNumberException extends RuntimeException {
    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message,cause);
    }
}
