package com.mazic.dao;

import com.mazic.entity.Article;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


public interface ArticleDao {
    /**
     * 查询文章详细内容
     *
     */
    Article queryArticle(@Param("articleId") int articleId);

    /**
     * 插入文章
     */
    void insertArticle(@Param("article") Article article);

    /**
     * 分页查询文章
     */
    ArrayList<Article> queryByPage(@Param("pageNum") int pageNum,@Param("limit") int limit);
}
