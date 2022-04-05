package com.hga.blog.service;

import com.hga.blog.vo.ArticleVo;
import com.hga.blog.vo.params.PageParams;

import java.util.List;


public interface ArticleService {
    /**
     * 分页查询 文章列表
     * @param pageParams
     * @return
     */
    List<ArticleVo> listArticlesPage(PageParams pageParams);
}
