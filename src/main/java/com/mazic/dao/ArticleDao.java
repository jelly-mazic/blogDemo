package com.mazic.dao;

import com.mazic.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


public interface ArticleDao {
    /**
     * 查询文章
     *
     * @return 返回文章详细信息
     */
    Article queryArticle(@Param("articleId") int articleId);

    /**
     * 分页查询文章列表
     */
    ArrayList<Article> queryArticleList(@Param("page") int page);

    /**
     * 更新文章
     *
     * @return 如果影响行数>0,代表更新成功
     */
    int updateArticle(@Param("article") Article article);

    /**
     * 创建文章
     *
     * @param selfResume
     */
    void insertArticle(@Param("article") Article article);


}
