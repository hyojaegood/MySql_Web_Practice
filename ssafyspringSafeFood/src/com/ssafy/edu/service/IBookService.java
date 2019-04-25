package com.ssafy.edu.service;

import java.util.HashMap;
import java.util.List;

import com.ssafy.edu.dto.BookDto;

public interface IBookService {
	
	public List<BookDto> getBooklist() throws Exception;
	public void addBook(BookDto b)throws Exception;
	public List<BookDto>  searchBook(HashMap<String, String> bookMap)throws Exception;
	
}
