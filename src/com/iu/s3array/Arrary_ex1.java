package com.iu.s3array;

import java.util.Scanner;

public class Arrary_ex1 {
public static void main(String[] args) {
	//1.학생수를 입력
	//2.학생수 만큼 이름을 입력 a,b
	//3.학생수 만큼 학생의 번호 , 국어 , 영어 , 수학 입력
	//a 학생의 번호 :
	//a 학생의 국어 :
	//a 학생의 영어 :
	//a 학생의 수학 :
	//a학생이 끝나면 b학생의 것들 나옴
	//입력이 끝나면 총점과 평균 계산
	
	// 모든 학생의 정보 출력
	// 이름 번호 국어 영어 수학  총점  평균
	// a     1 53  65  55
	//....
	Scanner sc = new Scanner(System.in);
	
	System.out.println("학생의 수를 입력하세요");
	int count = sc.nextInt();
	String [] names = new String[count];
	int [] nums = new int [names.length];
	int [] k = new int[names.length];
	int [] e = new int[names.length];
	int [] d = new int[names.length];
	int [] t = new int[names.length];
	double[] v =new double[names.length];

	
	for (int i=0; i<names.length;i++) {
		System.out.println(i+1+"번째 이름을 입려하세요");		
		names[i] = sc.next();	
	}
	for (int i=0; i<names.length;i++) {
		System.out.println(names[i]+"의 번호 입력");
		nums[i] = sc.nextInt();
		System.out.println(names[i]+"의 국어 입력");
		k[i] = sc.nextInt();
		System.out.println(names[i]+"의 영어 입력");
		e[i] = sc.nextInt();
		System.out.println(names[i]+"의 수학 입력");
		d[i] = sc.nextInt();
		t[i] = k[i]+e[i]+d[i];
		v[i] = t[i]/3;
		
	}	
			System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<names.length;i++) {			
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			System.out.print(k[i]+"\t");
			System.out.print(e[i]+"\t");
			System.out.print(d[i]+"\t");
			System.out.print(t[i]+"\t");
			System.out.println(v[i]);
}
}
}
