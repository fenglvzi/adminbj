package com.zhmgame.adminbj.web;

import com.zhmgame.adminbj.dto.ProxyGrantInfo;
import com.zhmgame.adminbj.dto.Result;
import com.zhmgame.adminbj.entity.User;
import com.zhmgame.adminbj.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 代理充值中心控制，
 *
 */
@Controller
@RequestMapping("/grant_diamond")
public class ProxyController {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    /**
     * 代理商在充值页面输入玩家的id后，查询出玩家的昵称
     *并且查询出代理商剩余的钻石，
     * @return
     */
    @RequestMapping("/grantInfoController")
    @ResponseBody
    public Result<ProxyGrantInfo> grantInfoController(@RequestParam Integer userId,@RequestParam Integer proxyId){
        if (userId == null || userId.equals("")) {
            return new Result<ProxyGrantInfo>(false, "用户的id不能为空");
        }
        User user = null;
        ProxyGrantInfo proxyGrantInfo=null;
        try {
            user = userService.getById(userId);
            proxyGrantInfo = new ProxyGrantInfo();
            proxyGrantInfo.setUsername(user.getUsername());
            proxyGrantInfo.setDiamondTotal(userService.getById(proxyId).getDiamond());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
