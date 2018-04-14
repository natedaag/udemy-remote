package com.udemy.remote;

public class User {

	public static void main(String[] args) {
		TV tv = new TV();
		Projector projector = new Projector();
		SurroundSound sound = new SurroundSound();
		RemoteControl remote = RemoteControl.getInstance();
		
		remote.connectToDevice(projector);
		remote.onButton();
		
		remote.connectToDevice(tv);
		remote.onButton();
		
		remote.connectToDevice(sound);
		remote.onButton();
		
		remote.offButton();
		remote.connectToDevice(tv);
		remote.offButton();
		remote.connectToDevice(sound);
		remote.offButton();
		remote.connectToDevice(projector);
		remote.offButton();
	}

}
