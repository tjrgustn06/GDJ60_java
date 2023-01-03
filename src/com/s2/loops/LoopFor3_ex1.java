package com.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초를 입력 받아서
		//해당 분 초가 되면 반목문을 종료 합니다
		
		
//		for(int b=0; b<60; b++) {
//			System.out.println("분을 입력 해주세요");
//			int m = sc.nextInt();
//			System.out.println("초를 입력 해주세요");
//			int a = sc.nextInt();
//			for(int s=0; s<60;s++) {
//				
//				System.out.println(b+"분"+s+"초");
//				if(m==b && a==s) {
//					break;				
//				
//			} else if(m!=b &&a==s) {
//				System.out.println(b+"분"+s+"초");				
//				contiue;
//			}
//		}
//		System.out.println("프로그램 종료");
		System.out.println("분을 입력 해주세요");
		int m = sc.nextInt();
		System.out.println("초를 입력 해주세요");
		int a = sc.nextInt();
		
		int m1 = 0;
		int a1 = 5;
		boolean check = false;

		for(int b=0; b<60; b++) {		
			for(int s=0; s<60; s++) {
				System.out.println(b+"분"+s+"초");
				if(m1==b && a1==s) {
					s=60;
					b=60;
					check=true;
					break;
				}
			}
			if(check) {
				break;
			}
	}
	}

	
}