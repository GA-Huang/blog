package com.hga.blog.controller;

import com.hga.blog.vo.CategoryVo;
import com.hga.blog.vo.TagVo;
import com.hga.blog.vo.params.ArticleBodyParam;
import lombok.Data;

import java.util.List;

@Data
public class ArticleParam {

    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;
}