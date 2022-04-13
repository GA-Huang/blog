package com.hga.blog.service;

import com.hga.blog.vo.Result;
import com.hga.blog.vo.TagVo;

import java.util.List;

public interface TagsService {

    List<TagVo> findTagByArticleId(Long articleId);

    Result hots(int limit);

    Result findAll();
}
