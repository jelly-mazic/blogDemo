package com.mazic;

import com.mazic.dao.ArticleDao;
import com.mazic.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        Article result = articleDao.queryArticle(id);
        System.out.println(result.getContent());
    }

    @Test
    public void saveArticle() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = format.parse("2018-04-09 10:45:36");
        Article article = new Article("开门见山", "描述自己如何搭建博客",d,0,"随笔" );
        articleDao.insertArticle(article);

    }

    @Test
    public void changArticle() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = format.parse("2018-04-19 10:45:36");
        Article article = new Article("开门见山1", "描述自己如何搭建博客1",d,2,"随笔1" );
        article.setId(1);
        articleDao.updateArticle(article);

    }


}

