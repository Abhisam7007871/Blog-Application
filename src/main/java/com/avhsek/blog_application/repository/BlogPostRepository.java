package com.avhsek.blog_application.repository;

import com.avhsek.blog_application.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}