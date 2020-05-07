package com.moudles.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moudles.user.entity.User;
import com.moudles.user.mapper.UserMapper;
import com.moudles.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User getUser(String username) {
        User user = this.getOne(new QueryWrapper<User>().eq("username", username));
        return user;
    }

    @Override
    public void updateUser(User user) {
        this.updateById(user);
    }
}
