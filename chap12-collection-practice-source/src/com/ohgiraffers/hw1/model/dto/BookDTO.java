package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
	private int bNo = 0;
	private int category;
	private String title;
	private String author;
	public static int bNo2 = 0; 
	public BookDTO() {
	}
	public BookDTO(int category, String title, String author) {
		this.category = category;
		this.title = title;
		this.author = author;
		bNo = bNo2++;
	}
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public static int getbNo2() {
		return bNo2;
	}
	public static void setbNo2(int bNo2) {
		BookDTO.bNo2 = bNo2;
	}
	@Override
	public String toString() {
		return "BookDTO [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
}