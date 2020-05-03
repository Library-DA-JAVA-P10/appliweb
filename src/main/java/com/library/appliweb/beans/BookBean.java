package com.library.appliweb.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class BookBean {
    private Integer id;
    private String title;
    private String author;
    private String titleSlug;
    private String authorSlug;
    private Long isbn13;
    private Long isbn10;
    private String format;
    private Date pubDate;
    private String subjects;
    private Integer pages;
    private String overview;
    private String synopsis;
    private List<ExemplaireBean> exemplaires = new ArrayList<>();

}
