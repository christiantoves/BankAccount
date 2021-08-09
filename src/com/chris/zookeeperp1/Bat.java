package com.chris.zookeeperp1;

public class Bat extends Mammal{
	public Bat() {
		/* this.energyLevel=300; */
		setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("zoom zoom");
		this.energyLevel-=50;
	}
	
	public void eatHuman() {
		System.out.println("lol for the sake of research");
		this.energyLevel+=25;
	}
	
	public void attackTown() {
		System.out.println("chaos and destruction noises");
		this.energyLevel-=100;
	}
}
