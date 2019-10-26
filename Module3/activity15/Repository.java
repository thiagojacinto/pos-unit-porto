package activity15.contentMangement;

import java.util.ArrayList;

import activity15.peopleManagement.Author;
import activity15.peopleManagement.User;

public class Repository {
	
	// ATTRIBUTES
	User user;
	Book book;
	Item item;
	Author author;
	ArrayList<Repository> repo;
	
	// CONSTRUCTOR
	public Repository(User user, Book book, Item item, Author author) {
		this.user = user;
		this.book = book;
		this.item = item;
		this.author = author;
	
	}
	
	public Repository() {};
	
	// GETTERS AN SETTERS
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public ArrayList<Repository> getRepo() {
		return repo;
	}
	public void setRepo(ArrayList<Repository> repo) {
		this.repo = repo;
	}
	
	
}
