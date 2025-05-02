package com.javaex.ex01;

public class Member {
	
	
	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자
	
	
	//매소드-gs
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void setId(String Id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public String getId() {
		return id;
	}
	
	//매소드- 일반
	
	public void showInfo() {
		System.out.println("회원정보: " + name + "(" + id + "), " + point + "점"  );
	}
	
}
