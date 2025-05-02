package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		 Member jws = new Member();
		 Member yjs = new Member();
		 Member lhr = new Member();
		 
		 jws.setName("정우성");
		 jws.setPoint(50000);
		 jws.setId("jws");
		 
		 yjs.setName("유재석");
		 yjs.setPoint(30000);
		 yjs.setId("yjs");
		 
		 lhr.setName("이효리");
		 lhr.setPoint(40000);
		 lhr.setId("lhr");
		 
		 jws.showInfo();
		 yjs.showInfo();
		 lhr.showInfo();
		 
	}

}
