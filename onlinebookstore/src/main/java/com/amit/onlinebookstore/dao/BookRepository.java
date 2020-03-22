package com.amit.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.onlinebookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
