package com.Santana.objectMasterPt2;

public class Human {
//	Member Variable
	public int strenght = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
//	constructor
	public Human(){
	}
	
	public void attack(Human human) {
		human.health -= this.strenght;
	}
	
	public void showHealth() {
		System.out.println(this.health);
	}

}

