package com.udemy.remote;

public class TV implements Devices {

	@Override
	public void deviceOn() {
		System.out.println("TV on");
	}
	public void deviceOff() {
		System.out.println("TV off");
	}
	public String toString() {
		return "Tv";
	}
}
