package com.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Controlex3 {
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
	int select =sc.nextInt();	
	
	if(select==1) {	
		int h = random.nextInt(41);
		hp=hp+h;
	if(hp>40) {
		hp=40;
	}
	 System.out.println(hp);
	}
	
	else if(select==2){		
		int m = random.nextInt(41);
		mp=mp+m;
		if(mp>40) {
			mp=40;			
		}
		System.out.println(mp);
	
	}	else if(select==3) {
		int a = random.nextInt(6);
		monsterhp = monsterhp-a;
		mp=mp-3;
		System.out.println("mp를 소모하여 공격 하였습니다");
		System.out.println("남은 mp:"+ mp);
		System.out.println("가나다라마바사");
		System.out.println("몬스터가 "+a+ "데미지를 입었습니다");
		monsterhp =monsterhp-a;
		
		//주문을 외우기
		//0~5 이하의 수치 
		//mp 3 감소
	
	}	else if(select==4) {
		int b = random.nextInt(11);
		monsterhp=monsterhp-b;
		mp=mp-5;
		System.out.println("mp를 소모하여 공격 하였습니다");
		System.out.println("남은 mp"+mp);
		System.out.println("아자차카타파하");
		System.out.println("몬스터가 "+b+ "데미지를 입었습니다");
		monsterhp = monsterhp-b;
		
		//0~10 이하의 수치
		//mp5씩 감소
	}else {
		System.out.println("턴을 넘김니다");
		
		//코드
	}
	
	//유저의 이름과 HP, MP
	//몬스터의 이름과 HP
		System.out.println(name + " HP : " + hp + " MP : " + mp);
		System.out.println(monsterName + " MonsterHP : " + monsterhp);
		/*if(num==1){
		 * 
		 */
	}
	}

		
