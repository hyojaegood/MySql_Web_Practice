package com.ssafy.edu.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.dao.BookDao;
import com.ssafy.edu.dto.BookDto;
@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<BookDto> getBooklist() throws Exception {
		return bookDao.getBooklist();
	}

	@Override
	@Transactional
	public void addBook(BookDto b) throws Exception {
		bookDao.addBook(b);
	}

	@Override
	@Transactional(readOnly=true)
	public List<BookDto>  searchBook(HashMap<String, String> bookMap) throws Exception {
		return bookDao.searchBook(bookMap);
	}

}
