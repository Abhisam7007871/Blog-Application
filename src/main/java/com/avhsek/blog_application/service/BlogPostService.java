package com.avhsek.blog_application.service;

import com.avhsek.blog_application.model.BlogPost;
import com.avhsek.blog_application.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    public List<BlogPost> getAllPosts(){
        return blogPostRepository.findAll();
    }

    public  BlogPost createPost(BlogPost post){
        return blogPostRepository.save(post);
    }

    public BlogPost updatePost(Long id, BlogPost postDetails){
        BlogPost post =blogPostRepository.findById(id).orElseThrow(() -> new RuntimeException("Post not found"));
        post.setTitle(postDetails.getTitle());
        post.setContent(postDetails.getContent());
        return blogPostRepository.save(post);
    }

    public void deletePost(Long id){
        blogPostRepository.deleteById(id);
    }


}
