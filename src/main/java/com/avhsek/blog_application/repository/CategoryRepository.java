package com.avhsek.blog_application.repository;

import com.avhsek.blog_application.model.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Catagory, Long> {
}
