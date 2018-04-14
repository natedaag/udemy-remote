package com.udemy.remote;

public class SurroundSound implements Devices {

	@Override
	public void deviceOn() {
		System.out.println("SurroundSound on");
	}
	public void deviceOff() {
		System.out.println("surroundSound off");
	}
	public String toString() {
		return "Sound System";
	}

}
