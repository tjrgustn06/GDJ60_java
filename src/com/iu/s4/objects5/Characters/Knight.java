package com.iu.s4.objects5.Characters;

public class Knight extends Character implements AttackAble {
	
	int strong;
	
	Item item = new Sword();

	
	
	public void attack() {
		item.a();
	}

}
