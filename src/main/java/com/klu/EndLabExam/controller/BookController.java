package com.klu.EndLabExam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klu.EndLabExam.model.Book;
import com.klu.EndLabExam.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PutMapping("/updateBook")
	public String UpdateBook(@RequestBody Book book) {
		if(bookService.getBook(book.getId()) != null)
		{
			return bookService.updateBook(book);
		}
		return "no book with that is is found";
	}
}
