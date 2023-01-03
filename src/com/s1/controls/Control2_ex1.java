package com.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {
public static void main(String[] args) {
	
	//회원가입 할 때 입력한 id,pw
	int id = 1234;
	int pw = 5678;
	
	//키보드로 부터 id,pw를 입력 받아서 로그인 처리
	Scanner sc= new Scanner(System.in);
	
	
	
	
	System.out.println("id를 쳐주세요");
	int yid=sc.nextInt();
	System.out.println("pw를 쳐주세요");
	int ypw=sc.nextInt();
	
	if(yid==id && ypw==pw) {
		System.out.println("로그인 성공");
	}else {
		System.out.println("로그인 실패");
	}
}

}
