package com.amit.onlinebookstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.onlinebookstore.dao.BookRepository;
import com.amit.onlinebookstore.model.Book;

@Service
public class BookService implements BookServiceInterface {

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getBooks() {

		List<Book> books = new ArrayList<Book>();
		books = bookRepository.findAll();

		return books;
	}

	@Override
	public Optional<Book> getBookById(Long id) {

		Optional<Book> book = bookRepository.findById(id);
		return book;
	}

	@Override
	public Book addBook(Book book) {

		Book saveBook = bookRepository.save(book);
		return saveBook;
	}

	@Override
	public Boolean deleteBook(Long id) {
		try {
			bookRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
