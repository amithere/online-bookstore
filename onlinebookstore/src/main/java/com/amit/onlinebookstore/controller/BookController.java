package com.amit.onlinebookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.onlinebookstore.model.Book;
import com.amit.onlinebookstore.service.BookServiceInterface;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	BookServiceInterface bookServiceInterface;

	@GetMapping
	public List<Book> getBooks() {

		List<Book> books = bookServiceInterface.getBooks();
		return books;
	}

	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable("id") Long id) {

		Optional<Book> book = bookServiceInterface.getBookById(id);
		return book;
	}

	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book) {

		Book saveBook = bookServiceInterface.addBook(book);
		return new ResponseEntity<Book>(saveBook, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public String addBook(@PathVariable("id") Long id) {

		Boolean deleted = bookServiceInterface.deleteBook(id);
		if (deleted) {
			return "DELETED";
		} else {
			return "SOMETHING WENT WRONG";
		}

	}

}
