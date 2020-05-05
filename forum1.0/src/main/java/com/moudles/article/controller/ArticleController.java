package com.moudles.article.controller;


import com.commons.utils.HttpResult.HttpResult;
import com.commons.utils.HttpResult.HttpResultUtil;
import com.moudles.article.service.impl.ArticleServiceImpl;
import com.moudles.article.vo.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

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
       return HttpResultUtil.error("success",articleVo);
    }

}
