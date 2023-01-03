package com.s1.controls;

public class Control1 {

	public static void main(String[] args) {
		
		//단일 if
		//if(조건식){ 조건식이 true일 때 실행한다}
		//졸업시험, 무조건 좋업, 평균이 90점 이상이면 우등상 수상
		
		System.out.println("프로그램 시작");
		double avg = 80.12; //>,< 
		boolean check = true;
		int don = 0;
		if(avg>=90) { //check==true 구지 안써도 됨			
			System.out.println("우등상 수상");
			System.out.println("졸업을 축하 합니다");
			System.out.println("장학금 : "+don);
			don=100000000;
			}//if문에 끝
		
		System.out.println("장학금 : "+don);
		System.out.println("졸업을 축하 합니다");
		System.out.println("프로그램 종료");

	}//main의 끝

}
