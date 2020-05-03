package com.moudles.service.impl;

import com.moudles.entity.Reply;
import com.moudles.mapper.ReplyMapper;
import com.moudles.service.IReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 回复信息表 服务实现类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Service
public class ReplyServiceImpl extends ServiceImpl<ReplyMapper, Reply> implements IReplyService {

}
