package com.moudles.article.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.commons.utils.HttpResult.HttpResult;
import com.commons.utils.HttpResult.HttpResultUtil;
import com.moudles.article.entity.Article;
import com.moudles.article.service.impl.ArticleServiceImpl;
import com.moudles.article.vo.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleServiceImpl articleService;

    @RequestMapping("/save")
    public HttpResult<Object> save(@RequestBody ArticleVo articleVo){
       articleService.save(articleVo.getArticle(articleVo));
       return HttpResultUtil.success("message",articleVo);
    }

    @RequestMapping("/delete")
    public HttpResult<Object> delete(@RequestParam Integer id){
        return HttpResultUtil.success("message",articleService.updateFlags(id));
    }

    @RequestMapping("/update")
    public HttpResult<Object> update(@RequestParam ArticleVo articleVo){
        return HttpResultUtil.success("message",articleService.updateById(articleVo.getArticle(articleVo)));
    }

    @RequestMapping("/list")
    public HttpResult<Object> list(@RequestBody ArticleVo articleVo){
        return HttpResultUtil.success("message",articleService.list(new QueryWrapper<Article>().eq("create_by",articleVo.createBy)));
    }


}
