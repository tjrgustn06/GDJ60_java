package com.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	//Game : TRPG
	//법사
	String name ="핫팩";
	int hp = 20;
	int mp = 20;
	
	String monsterName="오크";
	int monsterhp = 10;
	
	//1. hp보충(포션) 2.mp보충 3.마법1 4.마법2 5.턴을 넘기기
	//HP 보충시 최대 40이 끝
	//보충시 랜덤하게 0~40사이의 숫자를 받아서 Hp에 더하기
	//MP 보충시 최대 40이 끝
	//보충시 랜덤하게 0~40사이의 숫자를 받아서 Mp에 더하기
	//int test1 = random.nextInt(40);//0~5 미만의 정수하나를 리턴 
	//int test2 = random.nextInt(30);//0~30 미만의 정수하나를 리턴

	//System.out.println("test1 :"+test1);
	//System.out.println("test2 :"+test2);  
	
	
	System.out.println("1.hp보충(포션) 2.mp보충 3.마법1 4.마법2 5.턴을 넘기기.");
	int a =sc.nextInt();
	
	if(a==1) {
		System.out.println("hp포션을 먹습니다");		
		int test1 = random.nextInt(40);
		int total = hp+test1;
		if(total<=40) {
			System.out.println(total);
	}else{
		 total = total>=40?  40 : total; 
		 System.out.println(total);
	}
	if(mp>=40) {
		System.out.println("40");
	}else {
		System.out.println(mp+test1);
	}
	
	
	

	}	
}
}
