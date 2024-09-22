package com.avhsek.blog_application.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Catagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "catagory", cascade = CascadeType.ALL)
    private Set<BlogPost> blogPosts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(Set<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
}
