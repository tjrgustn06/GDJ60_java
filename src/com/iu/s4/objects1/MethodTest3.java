package com.iu.s4.objects1;

public class MethodTest3 {
	
					//int salary=매개 변수
	public void t3(int salary,double tax) {
		
		//실급여를 계산하는 메서드
		//0.97or3.3
		salary = (int)(salary*tax);
	 System.out.println("T3:"+salary);
		
	}
	
	
	public void info(Sword sword) {
		//Sword 모든 정보를 출력
//		System.out.println(sword.name);
//		System.out.println(sword.attack);
//		System.out.println(sword.life);
//		System.out.println(sword.level);
//		System.out.println(sword.price);
		
		
	}

}
