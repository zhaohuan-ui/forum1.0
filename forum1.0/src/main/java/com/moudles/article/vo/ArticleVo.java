package com.moudles.article.vo;

import com.moudles.article.entity.Article;

import java.time.LocalDateTime;

public class ArticleVo {

    
     public Integer id;

    /**
     * 标题
     */
    public String title;

    /**
     * 内容
     */
    public String content;

    /**
     * 浏览量
     */
    public Integer views;

    /**
     * 作者
     */
    public Integer createBy;

    /**
     * 是否可见
     */
    public Integer visible;

    /**
     * 逻辑删除
     */
    public Integer flags;

    /**
     * 创建时间
     */
    public LocalDateTime createTime;

    /**
     * 发布时间
     */
    public Integer releaseTime;

    /**
     * 最新更新时间
     */
    public LocalDateTime updateTime;

    /**
     * 备用字段一
     */
    public String spare1;

    /**
     * 备用字段二
     */
    public String spare2;

    /**
     * 备用字段三
     */
    public Integer spare3;

    public ArticleVo(){}

    public Article getArticle(ArticleVo articleVo){
        Article article = new Article();
        if(articleVo.title != null){
            article.setTitle(articleVo.title);
        }
        if(articleVo.content != null){
            article.setContent(articleVo.content);
        }
        if(articleVo.views != null){
            article.setViews(articleVo.views);
        }
        if(articleVo.createBy != null){
            article.setCreateBy(articleVo.createBy);
        }
        if(articleVo.visible != null){
            article.setVisible(articleVo.visible);
        }
        if(articleVo.flags != null){
            article.setFlags(articleVo.flags);
        }
        if(articleVo.createTime != null){
            article.setCreateTime(articleVo.createTime);
        }
        if(articleVo.releaseTime != null){
            article.setReleaseTime(articleVo.releaseTime);
        }
        if(articleVo.updateTime != null){
            article.setUpdateTime(articleVo.updateTime);
        }
        return article;
    }
}
