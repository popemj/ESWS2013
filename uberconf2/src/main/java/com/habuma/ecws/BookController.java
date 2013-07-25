package com.habuma.ecws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/books")
public class BookController {

	private BookRepository repository;

	@Autowired
	public BookController(BookRepository repository) {
		this.repository = repository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String showBooks(Model 	model) {
		
		model.addAttribute(repository.findAll());
		return "books";
	}
	

	@RequestMapping(method=RequestMethod.GET, params="form")
	public String bookForm(Model model) {
		model.addAttribute(new Book());
		return "form";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String save(Book book, RedirectAttributes model) {
		repository.save(book);
		model.addFlashAttribute("thanks", "Thank you for the book");
		return "redirect:/books";
	}
	
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<Book> getBooks() {
		return repository.findAll();
	}
	
}
