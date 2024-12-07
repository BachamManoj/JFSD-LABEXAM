package com.klu.EndLabExam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.EndLabExam.model.Book;
import com.klu.EndLabExam.repository.BookRepository;

@Service
public class BookServiceImplementation implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book getBook(Long id) {
		Optional<Book> book=bookRepository.findById(id);
		if(book.isPresent())
		{
			return book.get();
		}
		return null;
	}

	@Override
	public String updateBook(Book book) {
		if(book==null)
		{
			return "book is null";
		}
		else
		{
			bookRepository.save(book);
			return "book updated successfully";
		}
	}

}
