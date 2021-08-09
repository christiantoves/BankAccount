package com.chris.zookeeperp1;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
//		this.energyLevel = 100;
		setEnergyLevel(100);
	}
	
	public void displayEnergy() {
		System.out.println(this.energyLevel);
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
