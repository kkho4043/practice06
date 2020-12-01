package com.javaex.ex06;

public class MyBase extends Base{
	public void service(String state) {
		 if (state.equals("오후")) {
			 after();
	        }else {
	        	super.service(state);
	        }
	}
	public void after() {
    	System.out.println("오후도 낮과 마찬가지로 공부해야합니다.");
    }
    //코드작성
    
}
