package com.iu.s3array;

public class Array1 {

	public static void main(String[] args) {
		
		//primitive type
		//숫자(정수형:byte,short,int,long)실수형:(float,double) 문자:char,논리형:boolean
		//refrence type
		//String
		
		double d1 = 1.2;
		d1 = 5.3;
		
		//변수 선언 공식
		//데이터타입 변수명;
		if(d1 > 0) {
			int num = 10;
		}
		
		//배열 선언 공식
		//모을려고하는 데이터 타입 [] 변수명  (ar==변수명)
		//refrence타입
		
		double [] ar = new double[2];
		int [] ar2 = new int[3];
		System.out.println(d1);
		System.out.println(ar);
		//ar2는 수동으로 초기화를 하지 않아서 값은 0으로 초기화가 된다
		//값은 타입만 맞게끔 초기화가 된다 예(double타입이라면 =0.0)(int타입이라면 =0)으로 초기화가 된다
		ar[0] = 3.3;
		ar[1] = 5.2;
		
		System.out.println(ar[0]);
		
		System.out.println(ar2[0]);
		
		int [] ar3 = {1,2,3};//값을 만들면서 배열해도 된다
		//index 를 사용했다는걸 알려주기 위해서 i을 많이 씀
		//[](배열)은 뒤에 선언해도 된다
		int ar4[] = {2,3,4};
		
		for(int i=0;i<3;i++) {
			System.out.println(ar3[i]);
		}
		

	}

}
