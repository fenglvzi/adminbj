package com.zhmgame.adminbj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 张译文 on 2017/6/12.
 */
@RequestMapping("/test")
@Controller
public class TestController {
    @RequestMapping("/ford")
    public String login(HttpServletRequest request, HttpSession session) {
        request.setAttribute("msg", "成功使用一次springmvc");
        System.out.println(request.getContextPath());
        return "forward:/WEB-INF/jsp/list.jsp";
    }
}
