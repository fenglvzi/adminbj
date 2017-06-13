package com.zhmgame.adminbj.core.exception;

/**
 * Created by 张译文 on 2017/6/13.
 */
public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(String message) {
        super(message);
    }
    public NoSuchUserException(String message,Throwable cause){
        super(message);
    }
}
