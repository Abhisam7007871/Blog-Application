package com.avhsek.blog_application.service;

import com.avhsek.blog_application.model.BlogPost;
import com.avhsek.blog_application.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    // Get all posts
    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    // Get post by ID
    public BlogPost getPostById(Long id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    // Create post
    public BlogPost createPost(BlogPost post) {
        return blogPostRepository.save(post);
    }

    // Update post
    public BlogPost updatePost(Long id, BlogPost postDetails) {
        BlogPost post = blogPostRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        post.setTitle(postDetails.getTitle());
        post.setContent(postDetails.getContent());
        return blogPostRepository.save(post);
    }

    // Delete post
    public String deletePost(Long id) {
        Optional<BlogPost> postToDelete = blogPostRepository.findById(id);
        if (postToDelete.isPresent()) {
            BlogPost post = postToDelete.get();
            blogPostRepository.deleteById(id);
            // Returning the message with post ID and title
            return "Post with ID: " + post.getId() + " and Title: " + post.getTitle() + " was deleted successfully.";
        } else {
            return "Post with ID: " + id + " not found.";
        }
    }
}
