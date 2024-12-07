package com.klu.EndLabExam.service;

import com.klu.EndLabExam.model.Book;

public interface BookService {
	public Book getBook(Long id);
	public String updateBook(Book book);
}
