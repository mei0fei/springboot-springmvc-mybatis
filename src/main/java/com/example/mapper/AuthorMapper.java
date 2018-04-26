package com.example.mapper;

import java.util.List;

import com.example.model.Author;

public interface AuthorMapper {
	List<Author> findAllAuthors();
	Author findAuthorById(int id);
	void insertAuthor(Author author);
	void updateAuthor(Author author);
	void deleteAuthor(int id);


}
