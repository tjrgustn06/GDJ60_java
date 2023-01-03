package com.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//학생수를 입력 받고
	// 학생수 만큼 점수를 입력받아서
	//총 합계를 출력
//		System.out.println("학생 수를 입력 하세요");
//		int a = sc.nextInt();
//		
//		int total=0;
//		for(int i=0; i<a; i++) {
//			
//			
//			System.out.println("점수를 입력하세요");
//			int b = sc.nextInt();
//			total=total+b;
//			
//		}
//		System.out.println("합계: "+total);
		System.out.println("초를 입력하세요");//5를 입력
		int sec = sc.nextInt();
		
	    for(int i=0; i<60; i++) {
		System.out.println(i+"초");
	    if(sec==i) {
	    	i=60;
	    }
	    }
		
	    System.out.println("종료");
	

}
}
