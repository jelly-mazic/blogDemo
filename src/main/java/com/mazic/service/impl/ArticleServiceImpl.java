package com.mazic.service.impl;

import com.mazic.dao.ArticleDao;
import com.mazic.dao.ResumeDao;
import com.mazic.entity.Article;
import com.mazic.entity.Resume;
import com.mazic.service.ArticleService;
import com.mazic.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;


    @Override
    public void buildArticle(Article newArticle) {
        articleDao.insertArticle(newArticle);
    }
}
