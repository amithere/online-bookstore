package com.amit.onlinebookstore.service;

import java.util.List;
import java.util.Optional;

import com.amit.onlinebookstore.model.Book;

public interface BookServiceInterface {

	public List<Book> getBooks();

	public Optional<Book> getBookById(Long id);

	public Book addBook(Book book);

	public Boolean deleteBook(Long id);

}
