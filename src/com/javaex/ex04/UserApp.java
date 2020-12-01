package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] us = new User[3];
		
		Customer c1 = new Customer("jws" , "j1234" , "정우성" , 1000);
		Customer c2 = new Customer("yjs" , "y1234" , "이효리" , 2000);
		
		Employee e1 = new Employee("master" , "m7788" ,"운영자",5000000);
		
		us[0] = c1;
		us[1] = c2;
		us[2] = e1;
		
		for(int i = 0;i < us.length ;i++) {
			us[i].showInfo();
		}
	}

}
