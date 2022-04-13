package com.hga.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hga.blog.dao.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章id查询标签列表
     * @param articleId
     * @return
     */
    List<Tag> findTagByArticleId(Long articleId);

    /**
     * 查询最热标签前n条
     * @param limit
     * @return
     */
    List<Long> findHotsByTagsId(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
