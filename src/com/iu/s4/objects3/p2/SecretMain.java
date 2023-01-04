package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.*; // 패키지명은 *표시를 못한다 클래스명은 * 써도 가능하다

public class SecretMain {

	public static void main(String[] args) {
		
		Secret secret = new Secret();
		//com.iu.s4.objects3.p2.Secret secret2 = new com.iu.s4.objects3.p2.Secret(); //같은 이름의 클래스를 쓸때는 둘중 하나는 꼭! 풀패키지를 써줘야 한다		
		
		
//		secret.money = 1;
//		
//		secret.s1();
//		//secret.s2();
//		
//		System.out.println(secret.point);		
//		Test test = new Test();
//		System.out.println(test.point);

	}

}
