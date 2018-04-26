package com.mazic.entity;

import java.util.Date;

public class Article {

    private int articleId;
    private String title;//标题
    private String descri;//简介
    private String content;//内容
    private int readNum;//阅读量
    private String tag;//标签
    private Date articleDate;//创建时间

    public Article() {

    }

    public Article(String title, String descri, String content, String tag, Date articleDate) {
        this.title = title;
        this.descri = descri;
        this.content = content;
        this.tag = tag;
        this.articleDate = articleDate;
    }

    public String getdescri() {
        return descri;
    }

    public void setdescri(String descri) {
        this.descri = descri;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
