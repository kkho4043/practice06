package com.javaex.ex02;

public class Triangle extends Shape{
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println("생성자 triangle 0 실행 ");
	}
	public Triangle(int width,int height) {
		this.width = width;
		this.height =height;
		System.out.println("생성자 triangle 2 실행 ");
	}
	
	public Triangle(String fillColor , String lineColor ,int width,int height) {
		super(fillColor,lineColor);
		this.width = width;
		this.height =height;
		System.out.println("생성자 triangle 4 실행 ");
	}
	
	
	
}


