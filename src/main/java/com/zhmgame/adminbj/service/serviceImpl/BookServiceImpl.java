package com.zhmgame.adminbj.service.serviceImpl;

import com.zhmgame.adminbj.core.enums.AppointStateEnum;
import com.zhmgame.adminbj.core.exception.AppointException;
import com.zhmgame.adminbj.core.exception.NoNumberException;
import com.zhmgame.adminbj.core.exception.RepeatAppointException;
import com.zhmgame.adminbj.dao.AppointmentDao;
import com.zhmgame.adminbj.dao.BookDao;
import com.zhmgame.adminbj.dto.AppointExecution;
import com.zhmgame.adminbj.entity.Appointment;
import com.zhmgame.adminbj.entity.Book;
import com.zhmgame.adminbj.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 张译文 on 2017/6/10.
 */
@Service
public class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AppointmentDao appointmentDao;

    public Book getById(Integer id) {
        return bookDao.queryById(id);
    }

    public List<Book> getList() {
        return bookDao.queryList(0,1000);
    }

    @Transactional
    public AppointExecution appoint(Integer bookId, Integer studentId) {
        try {
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {
                throw new NoNumberException("库存不足");
            } else {
                Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
            }
        } catch (NoNumberException e1) {
            throw e1;
        } catch (RepeatAppointException e2) {
            throw e2;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new AppointException("预约内部错误" + e.getMessage());
        }
    }
}
