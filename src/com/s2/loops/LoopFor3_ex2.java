package com.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배그??
		//총알 30발 ->1탄창
		//캐릭터당 ->3탄창
		
		
		//1.단발
		//2.점사
		
		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복 출력
		System.out.println("번호를 눌러주세요");
		System.out.println("1.단발 2.점사");
		int a = sc.nextInt();
		if(a==1) {
			for(a=1; a<30; a++) {
			System.out.println("탕");
			a=30;
		}
		}else {
		System.out.println("타타탕");
		}
	}

}
