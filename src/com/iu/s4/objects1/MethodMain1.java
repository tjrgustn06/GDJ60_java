package com.iu.s4.objects1;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("Main Method 실행");
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 = new MethodTest3();
		Sword sword = new Sword();
		int salary = 3000000;
		//호출시 매개 변수로 보내는 값: 인자값
		mt3.t3(salary,0.97);
		//메서드를 호출한다
		mt3.info(sword);
		System.out.println("Main: "+salary);
		sword.name="집행검";
		sword.attack = 50;
		sword.level=3;
		sword.life=200;
		sword.price=50000;
				
		
		//mt.t1();	
		
		System.out.println(sword.name);
		System.out.println(sword.attack);
		sword.name ="단도";
		System.out.println(sword.name);
		System.out.println("Main Method 종료");
		
		

	}

}
