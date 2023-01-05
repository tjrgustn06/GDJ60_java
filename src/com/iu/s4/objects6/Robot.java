package com.iu.s4.objects6;
								//Robot은 Left,Right에 의존적이다(dependency) 집어 넣는과정을 injection dependency => DI 의존성주입
public class Robot {
	
	private ArmLeft armLeft;
	private ArmRight armRight;
	
	public Robot() {
		this.armRight = new ArmRight();
	}
	
	public Robot(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	
	

}
