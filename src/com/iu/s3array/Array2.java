package com.iu.s3array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[3];
		int [] ar2 = new int[2];
		
		//키보드로 부터 숫자를 입력 받아서 해당 숫자 만큼 배열을 생성
		//배열의 값을 키보드로 부터 입력 받고
		//값들을 출력

		System.out.println("숫자를 입력하세요");
		int count =sc.nextInt();
		int [] ar3 = new int[count];
		
		for(int i=0;i<count;i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요");
			ar3[i] = sc.nextInt();
		}
		
		for(int i=0; i<ar3.length; i++) {
			System.out.println(ar3[i]);
		}
		
		// System.out.println(ar[4]); ar[4]가 없기 때문에 출력에서 에러가 뜸

	}

}
