package com.api.book.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;
//	private static List<Book> list=new ArrayList<Book>();
//	
//	static
//	{
//		list.add(new Book(1010,"javabylist","abc"));
//		list.add(new Book(2020,"javabylist2","abc2"));
//		list.add(new Book(3030,"javabylist3","abc3"));
//	}
	
//	getallbooks
	public List<Book> getAllBooks()
	{
		List<Book> list=(List<Book>)this.bookRepository.findAll();
		return list;
	}
//	getsingle book by id
	public Book getBookById(int id)
	{
//		using stream api function
		Book book=null;
//		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		book=this.bookRepository.findById(id);
		return book;
	}
	//adding the book
	public Book addBook(Book b)
	{
//		list.add(b);
		Book result=bookRepository.save(b);
		return result;
	}
	//delete book by id
//	public void deleteBook(int bid)
//	{
//		list.stream().filter(book->{
//			if(book.getId()!=bid)
//			{
//				return true;
//			}
//			else 
//			{
//			return false;
//			}
//		}).collect(Collectors.toList());
//	}
	//or
	//delete book by id
	public void deleteBook(int bid)
	{
//		list=list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		bookRepository.deleteById(bid);
	}
	//update book
	public void updateBook(Book book, int bookId) 
	{
//		list=list.stream().map(b->{
//			if(b.getId()==bookId)
//			{
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		bookRepository.save(book);
		
	}
	
}
