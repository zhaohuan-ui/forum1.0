package com.moudles.service.impl;

import com.moudles.entity.Article;
import com.moudles.mapper.ArticleMapper;
import com.moudles.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
