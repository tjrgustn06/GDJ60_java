package com.iu.s4.objects2;
//overloading
public class Car {

	private static final String Black = null;
	String company="BMW";
	String name;
	int price;
	String color;
	{
		//초기화 블럭 
		System.out.println("초기화 블럭 : "+this.company);
		this.company="AUDI";
	}
	
	
 Car() {
//		this.("black");//생성자내에서 다른 생성자 호출	참조변수 this
	 System.out.println("생성자 :"+ this.company);
	 	this.company = "Kia";
		this.name = "스포티지";
		this.price =3500;
		this.color ="Black";				
	}
	
	public Car(String color) {	
//		this.("black",3500);
		this.company = "Kia";
		this.name = "스포티지";
		this.price = 3500;
		this.color = color;
		
}
	
	public Car(String color, int price) {	
//		this.("black",3500,스포티지);
		this.company = "Kia";
		this.name = "스포티지";
		this.price = price;
		this.color = color;		
	}
	
	public Car(String color , int price, String name) {
//		this.("black",3500, 스포티지, Kia);
		this.company = "Kia";  
		this.name = name;
		this.price = price;
		this.color = color;	
	}
	
	
	public void info() {
		System.out.println("Name :" + this.name);
		System.out.println("Company :"+ this.company);
		System.out.println("price :"+ this.price);
		System.out.println("Color :"+ this.color);
	}
	
	
	
}
