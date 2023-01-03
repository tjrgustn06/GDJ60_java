package com.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("국어 점수를 입력하세요");
	double a =0;
	a= sc.nextInt();
	System.out.println("영어 점수를 입력하세요");
	double b =0;
	b= sc.nextInt();
	System.out.println("수학 점수를 입력하세요");
	double c =0;
	c= sc.nextInt();
	
	double total=0;
	total=a+b+c;
	
	double avg=0.0;
	avg=total/3.0;
	//평균이 60점이상인가?
	
	//과목당 40점 미만이면 불합격
	
	// 최종적으로 합격 불합격 출력
	//if(avg>=60 && a>=40 && b>=40 && c>=40) {
		//System.out.println("합격입니다");
	//}else {
		//System.out.println("불합격입니다");
	//}
   if(avg>=60) {
	   if(a>=40 && b>=40 && c>=40) {		   
		   System.out.println("합격입니다");	   
	   }
	   else {
		   System.out.println("불합격입니다");
	   }
   }else {
	   System.out.println("불합격입니다");
   }
}
}
