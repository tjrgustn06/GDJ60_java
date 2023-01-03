package com.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean check = false;
		
		//로그인 시도 총 5번 시도가능
		
		//반복문 종료 후 
		//로그인이 성공했으면 "환영합니다" 출력 
		//로그인이 실패했으면 "은행 방문 하세요" 출력
		//System.out.println("아이디를 입력해주세요");
		//System.out.println("비밀번호를 입력해주세요");
		
		
//		for(int i=0; i<5; i++) {
//			int yid = sc.nextInt();
//			int ypw = sc.nextInt();
//		if(yid == id || ypw == pw) {
//			System.out.println("로그인 성공");
//			i=5;	
//			}else{
//				System.out.println("다시 입력 해주세요");
//			i=6;
//			System.out.println("은행에 방문");
//				}
				
	for(int i=0; i<5;i++) {
		System.out.println("아이디를 입력해주세요");
		int yid = sc.nextInt();
		System.out.println("비밀번호를 입력해주세요");
		int ypw = sc.nextInt();
		if(yid==id && ypw==pw) {
			System.out.println("로그인 성공");
			i=5;
			check = true;
		} else {
			System.out.println("로그인 실패");
		}

			
		} //여기 까지가 반복문
	if(check==true) {
		System.out.println("환영합니다");
	}else {
		System.out.println("은행을 방문하세요");
	}										//여기 까지가 다시 if문(반복문 을 빠져나옴)
		System.out.println("반복문 종료");
	
}			
		
	}

