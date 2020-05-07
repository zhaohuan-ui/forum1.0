package com.moudles.user.service;

import com.moudles.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
public interface UserService extends IService<User> {
    /**
     *  登录验证
     */
    User getUser(String username);

    void updateUser(User user);
}
