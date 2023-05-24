package com.internationalization.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internationalization.entity.Book;

public interface BookRepo extends JpaRepository<Book, UUID> {

	Book deleteByBookName(String bookName);

}
