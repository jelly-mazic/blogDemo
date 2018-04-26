package com.mazic;

import com.mazic.dao.ArticleDao;
import com.mazic.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by codingBoy on 16/11/27.
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ArticleDaoTest {
    @Resource
    private ArticleDao articleDao;

    @Test
    public void queryById() throws Exception {
        int id = 1;
        Article result =articleDao.queryArticle(id);
        System.out.println(result.getArticleDate());
    }

    @Test
    public void queryByPage() throws Exception {

        ArrayList<Article> result =articleDao.queryByPage(0,2);
        System.out.println(result.size());
    }
    @Test
    public void saveArticle() {
        Article article = new Article();
        article.setTitle("test");
        article.setContent("test");
        article.setdescri("asd");
        article.setTag("ta");
        article.setArticleDate(new Date());
        articleDao.insertArticle(article);
    }


}

