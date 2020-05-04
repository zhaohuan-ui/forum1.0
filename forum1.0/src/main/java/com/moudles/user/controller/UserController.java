package com.moudles.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.commons.constan.Globals;
import com.commons.request.LoginRequest;
import com.commons.utils.HttpResult.HttpResult;
import com.commons.utils.HttpResult.HttpResultUtil;
import com.moudles.user.VO.SessionInfo;
import com.moudles.user.entity.User;
import com.moudles.user.mapper.UserMapper;
import com.moudles.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService; // 用户user表

    /**
     *  登录验证
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public HttpResult<Object> login(@RequestBody User userRequest,HttpSession session) {
        try {
            /*User user = new User();
            user.setUsername(userRequest.getUsername());*/
            User user = userService.getOne(new QueryWrapper<User>().eq("username", userRequest.getUsername()));
            //将用户信息保存到session中
            SessionInfo sessionInfo = new SessionInfo();
            sessionInfo.setUser(user);
            session.setMaxInactiveInterval(60 * 60 * 6);
            session.setAttribute(Globals.USER_SESSION, sessionInfo);
            return HttpResultUtil.success("登录成功!",user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return HttpResultUtil.error("登录失败!");
    }

    /**
     *  获取token
     * @param token
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public HttpResult<Object> info(String token) {
        Map<String, String> map = new HashMap<>();
        map.put("name", token);
        map.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return HttpResultUtil.success("验证成功!",map);
    }

}
