package com.mazic.entity;

import java.util.Date;

public class Article {
    /**
     *id、title、content、date、read、tag
     */
    private  int id;//文章编号
    private  String title;//文章标题
    private  String content;//文章简介
    private  Date date;//文章发布时间
    private  int read;//文章阅读数
    private  String tag;//文章标签

    public Article(){

    }
    public Article(String title, String content, Date date, int read, String tag) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.read = read;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
