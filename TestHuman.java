package com.Santana.objectMasterPt2;

public class TestHuman {

	public static void main(String[] args) {
		Human alex = new Human();
		Wizard ver = new Wizard();
		Ninja sam = new Ninja();
		Samurai greg = new Samurai();
		alex.showHealth();
		ver.showHealth();
		ver.fireball(alex);
		alex.showHealth();
		ver.heal(alex);
		alex.showHealth();
		sam.steal(alex);
		alex.showHealth();
		sam.showHealth();
		sam.runAway();
		sam.showHealth();
		greg.showHealth();
		greg.deathBlow(alex);
		alex.showHealth();
		greg.showHealth();
		greg.meditate();
		greg.showHealth();
		Samurai.howMany();
	}

}
