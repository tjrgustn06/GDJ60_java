package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentView {
	//ViewList
	//학생들을 받아서 학생의 모든 정보를 출력
	
	
	
	//메서드명은 viewOne
	//학생 한명을 받아서 학생의 모든 정보를 출력하는 메서드
	
	public void view(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name :"+student.name);
		System.out.println("Num :"+student.num);
		System.out.println("kor :"+student.kor);
		System.out.println("eng :"+student.eng);
		System.out.println("math :"+student.math);
		System.out.println("total :"+student.total);
		System.out.println("avg :"+student.avg);
	}

	public void view(Student[] students) {		
		for(int i =0; i<students.length;i++) {
			Student student = students[i];
			this.view(student);
			
		}		
	}
}
	

