package com.iu.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		//main은 프로그램을 실행 목적
		//Test 목적
		//main은 어느 클래스 안에 있던지 상관 없음
				
		//학생 한명 생성
		//객체 생성
		//변수 선언과 거의 동일 primitive타입은 아니다
		//클래스명 변수명 = new 클래스명();  앞부분은 변수선언 =뒷부분이 객체생성부분 //null은 reference의 초기값
		Student student= new Student();
		Student student1= new Student();
		student.name="test";		
		student.num = 20;
		student1.name ="iu";
		student.num = 30;		
		System.out.println(student);
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		
		//학생 객체를 생성
		System.out.println(student1);
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
		//가비지 collector 
		System.out.println(student==student1);
		
		student = student1;
		System.out.println(student.name);
		student.name = "winter";
		System.out.println(student1.name);
		
		System.out.println("finish");

	}

}
