package com.habuma.ecws;

import java.util.List;

public interface BookRepository {

	void save(Book book);
	List<Book> findAll();
	
}
