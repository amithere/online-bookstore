package com.amit.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.onlinebookstore.model.BookCategory;

public interface CategoryRepository extends JpaRepository<BookCategory, Long> {

}
