package com.hga.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hga.blog.dao.pojo.Article;
import com.hga.blog.vo.Archives;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}
