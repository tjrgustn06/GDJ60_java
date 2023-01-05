package com.iu.s4.objects4;

public class GodMain {

	public static void main(String[] args) {
		
		//singleTon 디자인패턴	: (전체 프로그램에서 객체를 딱 하나 만들어주는것)
		
		God god = God.getInstance();
		god.setName("유일신");
		
		System.out.println("God :"+god);
		System.out.println("Name:"+god.getName());
		
		god = God.getInstance();
		
		System.out.println("God :"+god);
		System.out.println("Name:"+god.getName());
		
	}

}
