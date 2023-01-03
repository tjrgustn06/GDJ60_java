package com.s2.loops;

public class LoopFor1_ex1 {
public static void main(String[] args) {
	//0-100미만 사이의 짝수만 출력
	
	for(int i=0;i<100;i++) {
		if(i%2==0) {
		System.out.println(i);
		}
	System.out.println("=======================");
	
	//0-100미만 사이의 짝수만 출력 if문 없이 출력
	
       for(int a=0;a<100;a=a+2) {
		
    	   System.out.println(a);
    	   
       }
       System.out.println("=======================");
       //0~100미만의 합계를 구하세요
       //0+1+2+3....+99
      int total =0;
       for(int b=0; b<100; b++) {
        total = total + b;
       }  
       System.out.println(total); 
}
}
}
