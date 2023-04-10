package com.greedy.level02.normal.book.model.dto;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDTO bookDTO1 = new BookDTO();
		bookDTO1.printForMation();
		BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우 출판", "남궁성");
		bookDTO2.printForMation();
		BookDTO bookDTO3 = new BookDTO("홍길동전", "활빈당", "허균",50000000,0.5);
		bookDTO3.printForMation();
	}

}
