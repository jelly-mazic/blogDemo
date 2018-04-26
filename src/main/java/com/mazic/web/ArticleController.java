package com.mazic.web;

import com.mazic.entity.Article;
import com.mazic.service.ArticleService;
import com.mazic.until.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping(value = "/save ")
    public String saveArticle(@RequestParam("title")String title,
                              @RequestParam("tag")String tag,
                              @RequestParam("describe")String describe,
                              @RequestParam("content")String content){
        //请求中文乱码问题未解决
        String htmlContent = MyUtil.tranfer(content);
        Article article = new Article(title,describe,htmlContent,tag,new Date());
        articleService.buildArticle(article);
        return "resume";

    }

}
