package com.hga.blog.controller;

import com.hga.blog.service.ArticleService;
import com.hga.blog.vo.ArticleVo;
import com.hga.blog.vo.Result;
import com.hga.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//json数据进行交互
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页文章列表
     * @param pageParams
     * @return
     */
	//Result是统一结果返回
    @PostMapping
    public Result articles(@RequestBody PageParams pageParams) {
        //ArticleVo 页面接收的数据
        List<ArticleVo> articles = articleService.listArticlesPage(pageParams);

        return Result.success(articles);
    }
    @PostMapping("/hot")
    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }
    @PostMapping("/new")
    public Result newArticle(){
        int limit = 5;
        return articleService.newArticle(limit);
    }
    /**
     * 首页 文章归档
     * @return
     */
    @PostMapping("/listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long id) {
        ArticleVo articleVo = articleService.findArticleById(id);

        return Result.success(articleVo);
    }

    @PostMapping("/publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }

}