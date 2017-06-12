package com.zhmgame.adminbj.core.exception;

/**
 * Created by 张译文 on 2017/6/10.
 */
public class RepeatAppointException extends RuntimeException{
    public RepeatAppointException(String message) {
        super(message);
    }
    public RepeatAppointException(String message,Throwable cause){
        super(message);
    }

}
