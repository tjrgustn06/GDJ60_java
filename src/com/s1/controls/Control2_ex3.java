package com.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		
		System.out.println("id를 쳐주세요");
		int yid=sc.nextInt();
		System.out.println("pw를 쳐주세요");
		int ypw=sc.nextInt();
		boolean flag = false; //flase: 로그인X , true: 로그인 O
		
		
		if(yid==id && ypw==pw) {
			System.out.println("로그인 성공");
			flag=true;
		}else {
			System.out.println("로그인 실패");
		   flag=false;
		}		
		if(yid==id && ypw==pw) {
			System.out.println("급여입력");
		int salary = sc.nextInt();
		System.out.println("1. 정규직  2. 계약직");
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("정규직 선택");
			int tax=0;
			//누적 함수: a=a+?
			//고용보험
			//int tax1 =(int)(salary*0.02);
			tax=tax+(int)(salary*0.02);
			
			//의료보험
			//int tax2 =(int)(salary*0.03);
			tax=tax+(int)(salary*0.03);
			
			//산재 보험
			//int tax3 =(int)(salary*0.01);
			tax = tax + (int)(salary*0.01);
			
			//국민연금
			//int tax4 =(int)(salary*0.01);
			tax = tax + (int)(salary*0.01);
			//salary = salary-(tax1+tax2+tax3+tax4);
			salary= salary-tax;
		}else {
			System.out.println("계약직 선택");
			salary=(int) (int)(salary*0.97);
		}
		System.out.println("실급여 :"+salary);
		
		} else {
			System.out.println("로그인 한 사용자만 가능");
			
		}
		
		
		
		
			//if(flag) {
				//System.out.println("급여를 입금");}
				
			
		//로그인이 성공 했을 때만 실행
		//급여를 입력
		//정규직이면 1을 , 계약직이면 2를 입력
		//실급여 계산
		//정규직:고용보험 2%, 의료보험 3%, 국민연금1% 산재보험 1%
		//계약직:원청징수 3.3%
		//실급여 출력

}
}

