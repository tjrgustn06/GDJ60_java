package com.s1.controls;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로 부터 국어 , 영어, 수학 점수 입력 받음
		// 총점과 평균을 계산 합니다		
		//평균이 90점 이상히면 A를 출력
		//평균이 80점 이상히면 B를 출력
		//평균이 70점 이상히면 C를 출력
		//그외 나머지 F를 출력
		//단일 if문 여러개 사용
		//char ch =' ';
		//boolean check = false;
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
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		
		String level = "F";
		
		if(avg>=90) {
			//System.out.println("A");
			level = "A";
		} else if(avg>=80) { //System.out.println("B");
			level="b";
		} else if(avg>=70) { //System.out.println("C");
			level="C";
		} else {//System.out.println("F");
			//level="F";		
		}
		
		//출력문은 딱 한번만
		System.out.println(level);
	}
}
     

