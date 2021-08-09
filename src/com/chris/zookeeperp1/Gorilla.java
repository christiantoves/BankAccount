package com.chris.zookeeperp1;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("king kong said YEEET");
		this.energyLevel-=5;
	}
	public void eatBanana() {
		System.out.println("king kong hungy");
		this.energyLevel +=10;
	}
	public void climb() {
		System.out.println("king kong is all da wey up");
		this.energyLevel-=10;
	}
}
