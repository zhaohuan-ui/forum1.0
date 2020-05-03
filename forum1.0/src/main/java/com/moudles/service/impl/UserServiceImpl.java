package com.moudles.service.impl;

import com.moudles.entity.User;
import com.moudles.mapper.UserMapper;
import com.moudles.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
