package com.iu.s4.objects2;

public class Monster {

	
	//멤버변수,instance 변수
	int power;
	int hp;
	
	//멤버메서드 ,instance method
	//공격
	public boolean checkValue(Monster monster) {		
		//나의 power와 같고 나의 hp가 같다면 true를 리턴, 다르다면 flase리턴
		if(monster.hp==this.hp &&monster.power==this.power) {
			return true;
		}else {
			return false;
		}
		
	}	
	//어슬렁
	public void info() {
		System.out.println(this);
		//참조변수 this:class내부에서만 사용 가능 , 생성된 객체주소를 담음
		System.out.println(this.power);
		//this는 생략 가능
		System.out.println(hp);
		
		this.attack();
	}
	public void attack() {
		System.out.println("공격합니다");
		//this.info(); // overflow걸린상태임(무한반복)Error
	}
	
	
	public void setHp(int hp) {
		this.hp = hp; //여기서 this를 생략하면 지역변수가 먼저라 생략하면 지역변수로 바뀜	
	}
	
	
}
