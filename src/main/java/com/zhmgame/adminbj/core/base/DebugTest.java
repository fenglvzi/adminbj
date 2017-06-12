package com.zhmgame.adminbj.core.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 张译文 on 2017/6/10.
 */
public class DebugTest {
    private static Logger logger = LoggerFactory.getLogger(DebugTest.class);

    public static void main(String[] args) {
        // System.out.println("This is println message.");

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }

}
