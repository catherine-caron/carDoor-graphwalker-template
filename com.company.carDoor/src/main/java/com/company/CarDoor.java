package com.company;

public class CarDoor {

	private CarDoorStatus status = CarDoorStatus.CLOSED;

	public CarDoor() {
		this.status = CarDoorStatus.CLOSED;	
	}

	public CarDoorStatus getStatus() {
		return this.status;
	}

	public void closeDoor() {
		if(status.compareTo(CarDoorStatus.OPENED) == 0) {
			status = CarDoorStatus.CLOSED;
		}
	}

	public void openDoor() {
		if(status.compareTo(CarDoorStatus.CLOSED) == 0) {
			status = CarDoorStatus.OPENED;
		}
	}

	public void lockDoor() {
		if(status.compareTo(CarDoorStatus.CLOSED) == 0) {
			status = CarDoorStatus.LOCKED;
		}
	}

	public void unlockDoor() {
		if(status.compareTo(CarDoorStatus.LOCKED) == 0) {
			status = CarDoorStatus.CLOSED;
		}
	}
}
