package com.moudles.article.service.impl;

import com.moudles.article.entity.Article;
import com.moudles.article.mapper.ArticleMapper;
import com.moudles.article.service.IArticleService;
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

    @Override
    public String updateFlags(Integer id) {
        if(this.updateById(getArticle().setId(id).setFlags(1))){
            return "success";
        }
        return "error";
    }

    public Article getArticle(){return new Article();}
}
