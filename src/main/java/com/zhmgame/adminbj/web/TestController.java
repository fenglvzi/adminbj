package com.zhmgame.adminbj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping("/login")
    public String login(Model model) throws Exception{
        model.addAttribute("msg", "这是我第一个mvc");
        return "forward:/WEB-INF/jsp/list.jsp";
    }
}
