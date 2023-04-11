package com.ohgiraffers.hw3.model.vo;

public class ProductDTO {
	private int pld;
	private String pName;
	private int price;
	private double tax;
	
	public ProductDTO() {
	}

	public ProductDTO(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}

	public String information() {
		return "ProductDTO [pld=" + pld + ", pName=" + pName + ", price=" + price + ", tax=" + tax + "]";
	}
	
	
	
	
	
}
