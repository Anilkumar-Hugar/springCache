package com.internationalization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.internationalization.entity.Book;
import com.internationalization.repo.BookRepo;

@Service
public class ServiceClass {
	@Autowired
	private BookRepo repo;

	public Book createBook(Book book) {
		return repo.save(book);
	}

	@Cacheable(cacheNames = "books")
	public List<Book> getAll() {
		System.out.println("from db");
		return repo.findAll();
	}

	@CacheEvict(cacheNames = "books", key = "#bookName")
	public Book deleteBook(String bookName) {
		return repo.deleteByBookName(bookName);
	}
}
