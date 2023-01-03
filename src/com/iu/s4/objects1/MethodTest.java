package com.iu.s4.objects1;

public class MethodTest {

	//메서드 선언 공식
	//public static void main(String[] args) {}
	//접근지정자 [그외지정자](필수는 아니다,필요하면쓰고 필요없으면 생략 가능) 리턴타입 메서드명([매개변수들 선언]){}
	
	//접근지정자:public
	//그외지정자: 생략(아직 안배움)
	//리턴타입 :void
	//매서드명 : 작명(매서드명의첫글짜는 소문자로)
	//매개변수 : 생략(아직 안배움)
	
	public void t1() {//()까지를 메서드의 header,선언부
		//{}까지를 메서드의 body, 내용
		//제어문, 반복문, 등등등
		System.out.println("t1 메서드 실행");
		MethodTest2 mt2 = new MethodTest2();
		
		mt2.info();
		
		int num =10;
		System.out.println("T1Num :"+ num);
		System.out.println("t1 메서드 종료");
		
	} 
	
	//t2 메서드 선언
	public void t2() {
		System.out.println("t2 메서드 실행");
		int num =20;
		System.out.println("T2 Num :"+num);
		System.out.println("t2 메서드 종료");
	}
}
