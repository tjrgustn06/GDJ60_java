package com.iu.s3array;

import java.util.Scanner;

public class Arrary6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {8,5,13,9,6};		

		
		//키보드로 부터 삭제하고 싶은 값을 입력 받기
		System.out.println("8,5,13,9,6");
		System.out.println("삭제 하실 숫자 입력");	
		int delete = sc.nextInt();
		int [] copy = new int [ar.length-1];
		int idx =0;
		
		for(int i=0; i<ar.length;i++) {
			
			if(ar[i]==delete) {
				continue;				
			} 
						
			copy[idx] = ar[i];
			idx++;
		}
		ar = copy;
		for(int i=0;0<ar.length;i++) {
			System.out.println(ar[i]);
		}

	}

}
