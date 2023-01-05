package com.iu.s4.objects5.Characters;

public class Archer extends Character implements AttackAble {
	
	
	private int dex;
	
	
	public Archer() {
		super("");
	}
	
	@Override
	public void attack() {
		System.out.println("활 공격");
	}
	
//	public void shoot() {
//		System.out.println("활쏘기");
//		System.out.println(this.getName());
//	}
	
	public void move() {
		System.out.println("이동~");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}

}
