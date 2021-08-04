package com.Santana.objectMasterPt2;

public class Wizard extends Human{
//	Member Variables
	
	public Wizard(){
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.health += this.intelligence;
	}
	
	public void fireball(Human target) {
		target.health -= this.intelligence *3;
	}
}
