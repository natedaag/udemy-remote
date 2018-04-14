package com.udemy.remote;

public class RemoteControl {
	
	private Devices device = null;
	private static final RemoteControl INSTANCE = new RemoteControl();

	private RemoteControl() {
		
	}
	public static RemoteControl getInstance() {
		return INSTANCE;
	}
	
	public void connectToDevice(Devices aDevice) {
		this.device = aDevice;
		System.out.println("connected to..." + device);
	}
	
	public void onButton() {
		device.deviceOn();
	}
	
	public void offButton() {
		device.deviceOff();
	}
}
