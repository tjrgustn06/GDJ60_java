package com.s1.controls;

import java.util.Scanner;

public class Control4_ex1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("평균을 입력");
	int avg = sc.nextInt();
	//평균이 90점 이상이면 A
	//평균이 80점 이상이면 B
	//평균이 70점 이상이면 C
	//그외 나머지 F
	//switch case사용
	
	
	switch(avg/10) {
	case 10:
	case 9: 
		System.out.println("A입니다");
		break;
	case 8:
		System.out.println("B입니다");
		break;
	case 7:
		System.out.println("C입니다");
		break;
	default:
		System.out.println("F입니다");
		break;
	}
}
}
