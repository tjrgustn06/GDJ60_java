package com.iu.s4.objects2;
//overloading
public class Car {

	String company;
	String name;
	int price;
	String color;
	
// Car() {
//		this();//생성자내에서 다른 생성자 호출	참조변수 this
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price =3500;
//		this.color ="Black";				
//	}
	
//	public Car(String color) {
//		this(Black);
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = 3500;
//		this.color = color;
		
//}
	
//	public Car(String color, int price) {
//		this(color,3500);
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = price;
//		this.color = color;		
//	}
	
	public Car(String color , int price, String name) {
		this(color, price, "스포티지");
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
