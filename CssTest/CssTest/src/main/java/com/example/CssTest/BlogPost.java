package com.example.CssTest;

import jakarta.persistence.*;

@Entity(name = "BLOGPOST")
public class BlogPost {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="HEADLINE")
    private String headline;

    @Column(name="BLOGPOSTTEXT")
    private String blogposttext;

    public BlogPost(){
    }

    public BlogPost(Long id, String headline, String blogposttext) {
        this.id = id;
        this.headline = headline;
        this.blogposttext = blogposttext;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBlogposttext() {
        return blogposttext;
    }

    public void setBlogposttext(String blogposttext) {
        this.blogposttext = blogposttext;
    }
}
