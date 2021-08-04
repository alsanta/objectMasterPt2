package com.Santana.objectMasterPt2;

public class Samurai extends Human{
//	Member Variables
	public static int total = 0;
	
	public Samurai() {
		this.health = 200;
		total += 1;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		this.health += (this.health/2);
	}
	
	public static void howMany() {
		System.out.println(total);
	}
}
