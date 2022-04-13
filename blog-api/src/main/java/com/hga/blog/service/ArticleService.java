package com.hga.blog.service;

import com.hga.blog.controller.ArticleParam;
import com.hga.blog.vo.ArticleVo;
import com.hga.blog.vo.Result;
import com.hga.blog.vo.params.PageParams;

import java.util.List;


public interface ArticleService {
    /**
     * 分页查询 文章列表
     * @param pageParams
     * @return
     */
    List<ArticleVo> listArticlesPage(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticle(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    ArticleVo findArticleById(Long id);

    Result publish(ArticleParam articleParam);
}
