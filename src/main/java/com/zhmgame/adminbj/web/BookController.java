package com.zhmgame.adminbj.web;

import com.zhmgame.adminbj.core.enums.AppointStateEnum;
import com.zhmgame.adminbj.core.exception.NoNumberException;
import com.zhmgame.adminbj.core.exception.RepeatAppointException;
import com.zhmgame.adminbj.dto.AppointExecution;
import com.zhmgame.adminbj.dto.Result;
import com.zhmgame.adminbj.entity.Book;
import com.zhmgame.adminbj.service.BookService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 张译文 on 2017/6/12.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list")
    private String list(Model model) {
        List<Book> list = bookService.getList();
        model.addAttribute("books", list);
        System.out.println("我要跳转到list界面 ");
        return "list";//  /web-inf/jsp/"list.jsp"
    }

    @RequestMapping("/{bookId}/detail")
    private String detail(@PathVariable("bookId") Integer bookId, Model model) {
        if (bookId == null) {
            return "redirect:/book/list";
        }
        Book book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/list";
        }
        model.addAttribute("book", book);
        return "detail";// /WEB-INF/detail.jsp
    }

    @RequestMapping(value = "/{bookId}/appoint", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    private Result<AppointExecution> appoint(@PathVariable("bookId") Integer bookId, @RequestParam("studentId") Integer studentId) {
        if (studentId == null || studentId.equals("")) {
            return new Result<AppointExecution>(false, "学号不能为空");
        }
        AppointExecution execution = null;
        try {
            execution = bookService.appoint(bookId, studentId);
        } catch (NoNumberException e1) {
            execution = new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
        } catch (RepeatAppointException e2) {
            execution = new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
        } catch (Exception e) {
            execution = new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
        }
        return new Result<AppointExecution>(true, execution);
    }
}
