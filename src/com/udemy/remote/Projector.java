package com.udemy.remote;

public class Projector implements Devices {
	
	@Override
	public void deviceOn() {
		System.out.println("Projector on");
	}
	public void deviceOff() {
		System.out.println("Projector off");
	}
	public String toString() {
		return "Projector";
	}

}
