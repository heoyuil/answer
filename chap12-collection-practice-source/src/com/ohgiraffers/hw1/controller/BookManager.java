package com.ohgiraffers.hw1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

public class BookManager {
	private ArrayList<BookDTO> booklist;
	private Scanner sc = new Scanner(System.in);
	
	
	public BookManager() {
		booklist = new ArrayList<>();
	}

	public void addBook(BookDTO book) {
		booklist.add(book);
	}
	
	public void deleteBook(int index) {
		booklist.remove(index);
	}
	
	public void searchBook(String btitle) {
		for(BookDTO b : booklist) {
			if(b.getTitle().equals(btitle)) {
				System.out.println(b);
				return;
			}
			
		}
		System.out.println("조회된 도서가 목록에 없습니다");
	}
	public void displayAll() {
		for(BookDTO book : booklist) {
			System.out.println(book);
		}
	}
	
	public List<BookDTO> sortedBookList(int type){
		switch(type) {
		case 1:booklist.sort(new AscBookNo());break;
		case 2:booklist.sort(new DescBookNo());break;
		case 3:booklist.sort(new AscBookTitle());break;
		case 4:booklist.sort(new DescBookTitle());break;
		}
		return booklist;
	}
	
	public void printBookList(List<BookDTO> printList) {
		for(BookDTO book : printList) {
			System.out.println(book);
		}
	}
	
	
}