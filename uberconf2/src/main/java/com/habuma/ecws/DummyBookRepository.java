package com.habuma.ecws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DummyBookRepository implements BookRepository {

	private List<Book> books = new ArrayList<Book>();
	
	@Override
	public void save(Book book) {
		books.add(book);
	}

	@Override
	public List<Book> findAll() {
		return books;
	}

}
