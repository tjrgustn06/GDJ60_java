package com.iu.s4.objects6;

public class Main {

	public static void main(String[] args) {
	 System.out.println("프로그램 시작"); 
	 Robot robot = new Robot();
	 ArmLeft armLeft = new ArmLeft();
	 
	 robot.setArmLeft(armLeft);
	 
	 System.out.println("ArmLeft: "+ robot.getArmLeft());
	 System.out.println("ArmRight: "+robot.getArmRight());
	 
	 robot = null;
	 
	 System.out.println("FixRobot에서 작성");
	 System.out.println("프로그램 종료");
	 
	 System.out.println("Add Robot에서 작업");
	 robot = new Robot();
	 System.out.println(robot);
	}

}
