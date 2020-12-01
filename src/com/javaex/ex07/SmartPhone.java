package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	 if("앱".equals(str)){
    		 startApp();
         }else{
             super.execute(str);
         }
        
    }
    protected void startApp(){
        System.out.println("앱실행");
    }
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
 
    //메소드작성
    
    //메소드작성
    
    
    
}
