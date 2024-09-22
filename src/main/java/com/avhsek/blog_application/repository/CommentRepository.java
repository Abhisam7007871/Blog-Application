package com.avhsek.blog_application.repository;

import com.avhsek.blog_application.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
