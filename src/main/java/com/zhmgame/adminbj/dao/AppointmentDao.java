package com.zhmgame.adminbj.dao;

import com.zhmgame.adminbj.entity.Appointment;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface AppointmentDao {
    /**
     * 插入预约图书记录
     * @param bookId
     * @param studentId
     * @return 插入的行数
     */
    int insertAppointment(@Param("booId") Integer bookId, @Param("studentId") Integer studentId);

    /**
     * 主键查询预约图书记录
     * @param bookId
     * @param studentID
     * @return 图书记录
     */
    Appointment queryByKeyWithBook(@Param("bookId") Integer bookId, @Param("studentId") Integer studentID);
}
