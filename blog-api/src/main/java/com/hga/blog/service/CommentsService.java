package com.hga.blog.service;

import com.hga.blog.vo.Result;
import com.hga.blog.vo.params.CommentParam;

public interface CommentsService {


    Result commentsByArticleId(Long articleId);

    Result comment(CommentParam commentParam);
}