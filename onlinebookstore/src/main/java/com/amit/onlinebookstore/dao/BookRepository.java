package com.amit.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.amit.onlinebookstore.model.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {

}
