/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.tables.pojos;


import com.diamondfsd.jooq.learn.codegen.tables.interfaces.IS9News;

import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 新闻表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S9NewsPojo implements IS9News {

    private static final long serialVersionUID = 2100636643;

    private Integer   id;
    private String    title;
    private String    content;
    private Timestamp createTime;
    private Timestamp updateTime;

    public S9NewsPojo() {}

    public S9NewsPojo(IS9News value) {
        this.id = value.getId();
        this.title = value.getTitle();
        this.content = value.getContent();
        this.createTime = value.getCreateTime();
        this.updateTime = value.getUpdateTime();
    }

    public S9NewsPojo(
        Integer   id,
        String    title,
        String    content,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Timestamp getCreateTime() {
        return this.createTime;
    }

    @Override
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("S9NewsPojo (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(content);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IS9News from) {
        setId(from.getId());
        setTitle(from.getTitle());
        setContent(from.getContent());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
    }

    @Override
    public <E extends IS9News> E into(E into) {
        into.from(this);
        return into;
    }
}