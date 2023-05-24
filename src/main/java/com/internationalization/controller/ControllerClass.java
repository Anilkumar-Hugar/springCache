package com.internationalization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.internationalization.entity.Book;
import com.internationalization.service.ServiceClass;

@RestController
@RequestMapping("/book")
public class ControllerClass {
	@Autowired
	private ServiceClass serviceClass;

	@PostMapping("/create")
	public Book createBook(@RequestBody Book book) {
		return serviceClass.createBook(book);
	}

	@GetMapping("/get")
	public List<Book> getAll() {
		return serviceClass.getAll();
	}

	@DeleteMapping("/delete")
	public Book delete(@RequestParam(name = "bookname") String bookName) {
		return serviceClass.deleteBook(bookName);
	}
}
