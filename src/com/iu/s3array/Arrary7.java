package com.iu.s3array;

import java.util.Scanner;

public class Arrary7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] ar = {5,1,4};
				
		//1.데이터 추가(내가 누른 숫자 추가)
		     //0번 인덱스에 추가
		//2.데이터 삭제
		    //0번 인덱스 삭제
		//3.종료
	boolean check= true;
		
		while(check) {
			System.out.println("1.데이터추가 2.데이터삭제 3.종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("숫자 입력");
				select = sc.nextInt();
				int [] copy = new int [ar.length+1];
				copy[0] = select;
				for(int i=0; i<ar.length; i++) {
					copy[i+1] = ar[i];
				}
				ar = copy;				
			}else if(select==2) {				
				
				int [] copy = new int[ar.length-1];
				
			for (int i =0; i<copy.length;i++) {
				copy[i] = ar[i+1];				
			}
				ar=copy;
				
			}else {
				System.out.println("종료합니다");
				break;
			}
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		}
				
	}

}
