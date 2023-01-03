package com.iu.s4.objects1;
public class ObjectMain2 {

	public static void main(String[] args) {
		
		//객체 생성
		//Sword의 Instance생성
		int n=10;
		Sword s1 = new Sword();
		s1.name ="집행검";
		s1.attack = 50;
		s1.level =3;
		s1.life = 200;
		s1.price = 500000;
		
		Knight knight = new Knight();
		knight.name="전사";
		knight.hp =2000;
		knight.dex = 40;
		knight.str = 60;		
		knight.sta = 60;
		knight.wiz = 20;
		
		knight.sword = s1;
		
		System.out.println(knight.sword.name);
		
		//변수 선언
		Sword s2=null; //reference의 초기값은 null 
		
		System.out.println(s2.attack);

	}

}
