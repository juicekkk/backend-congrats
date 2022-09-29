package com.jsk.congrats.api.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CommentVo {

    String cNum;
    String writer;
    @JsonIgnore
    String pwd;
    String content;
    String regDate;

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

}