package com.moudles.service.impl;

import com.moudles.entity.Follow;
import com.moudles.mapper.FollowMapper;
import com.moudles.service.IFollowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关注表 服务实现类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Service
public class FollowServiceImpl extends ServiceImpl<FollowMapper, Follow> implements IFollowService {

}
