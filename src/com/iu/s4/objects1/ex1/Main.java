package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("학원에서 공부한 내용");
		System.out.println("start");
		
		MenuController menuController = new MenuController();	
		
		menuController.start();
		System.out.println("집에서 추가한 내용");
		System.out.println("finish");
		
	}
	

}
