package com.moudles.article.service;

import com.moudles.article.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
public interface IArticleService extends IService<Article> {

    //删除文章 将flag改为1
    String updateFlags(Integer id);
}
