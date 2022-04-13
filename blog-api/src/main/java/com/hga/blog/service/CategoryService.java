package com.hga.blog.service;

import com.hga.blog.vo.CategoryVo;
import com.hga.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long id);

    Result findAll();
}