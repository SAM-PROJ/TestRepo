package com.api.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.Services.BookService;
import com.api.book.entities.Book;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	
//	@RequestMapping(value="/books",method=RequestMethod.GET)
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return bookService.getBookById(id);
	}
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book)
	{
		Book b=this.bookService.addBook(book);
		return b;
	}
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId)
	{
		this.bookService.deleteBook(bookId);
	}
	//Update book handler
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId)
	{
		this.bookService.updateBook(book,bookId);
		return book;
	}
}
