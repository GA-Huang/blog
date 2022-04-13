package com.hga.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hga.blog.dao.mapper.TagMapper;
import com.hga.blog.dao.pojo.Tag;
import com.hga.blog.service.TagsService;
import com.hga.blog.vo.Result;
import com.hga.blog.vo.TagVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
public class TagsServiceImpl implements TagsService {

    @Autowired
    TagMapper tagMapper;
    @Override
    public List<TagVo> findTagByArticleId(Long articleId) {
        List<Tag> tags = tagMapper.findTagByArticleId(articleId);
        return copyList(tags);
    }

    @Override
    public Result hots(int limit) {
       List<Long> tagIds = tagMapper.findHotsByTagsId(limit);
       if(CollectionUtils.isEmpty(tagIds)){
           return Result.success(Collections.emptyList());
       }
       List<Tag> tagList = tagMapper.findTagsByTagIds(tagIds);
        return Result.success(tagList);
    }

    public TagVo copy(Tag tag){
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag,tagVo);
        return tagVo;
    }
    public List<TagVo> copyList(List<Tag> tagList){
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;
    }

    @Override
    public Result findAll() {
        List<Tag> tags = this.tagMapper.selectList(new LambdaQueryWrapper<>());
        return Result.success(copyList(tags));
    }
}
