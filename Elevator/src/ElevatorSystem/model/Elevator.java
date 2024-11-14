package ElevatorSystem.model;

import ElevatorSystem.constants.Direction;

public class Elevator {
	
	private int elevatorId;
	private InternalButton internalButton;
	
	public Elevator(int elevatorId) {
		this.elevatorId = elevatorId;
		this.internalButton = new InternalButton();
	}
	
	public void processRequest(int floor, Direction direction) {
		System.out.println("Travelling to floor "+ floor);
	}

	public int getElevatorId() {
		return elevatorId;
	}

	public InternalButton getInternalButton() {
		return internalButton;
	}
}
