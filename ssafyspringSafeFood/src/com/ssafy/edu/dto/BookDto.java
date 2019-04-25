package com.ssafy.edu.dto;

import java.io.Serializable;
//com.ssafy.edu.dto.BookDto
public class BookDto implements Serializable {
	 private String isbn;
	 private String author;
	 private String title;
	 private String publisher;
	 private String content;
	 private int price;
	 private String pubdate;
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDto(String isbn, String author, String title, String publisher, String content, int price,
			String pubdate) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.content = content;
		this.price = price;
		this.pubdate = pubdate;
	}
	
	@Override
	public String toString() {
		return "BookDto [isbn=" + isbn + ", author=" + author + ", title=" + title + ", publisher=" + publisher
				+ ", content=" + content + ", price=" + price + ", pubdate=" + pubdate + "]";
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	} 
}
