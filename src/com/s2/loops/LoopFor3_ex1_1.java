package com.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			//배그??
			//총알 30발 ->1탄창
			//캐릭터당 ->3탄창
			
			
			//1.단발
			//2.점사
			
			//1번이면 "탕" 30번 반복 출력
			//2번이면 "타타탕" 10번 반복 출력
//	System.out.println("1.단발"+"2.점사");
//	int a = sc.nextInt();
	for(int a=1; a<4; a++) {
		System.out.println("1.단발   2.점사");
		int select = sc.nextInt();
		System.out.println(select);
		int count =0;
		String sound="";
		
		if(select==1) {		
				for(int b = 1;b<31;b++) {
					sound="탕";
					count=30;
				}
			System.out.println(sound);						
			} else {
			for(int b=1;b<11;b++) {
				sound = "타타탕";
				count= 10;
			}
				System.out.println(sound);
			}
	}
		System.out.println("탄창하나 소비");
		
		System.out.println();

}
}
