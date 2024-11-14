package ElevatorSystem.model;

import ElevatorSystem.controller.InternalButtonDispatcher;
import ElevatorSystem.repository.ElevatorSystemRepository;

public class InternalButton {
	
	public void sendRequest(int elevatorId, int floor) {
		InternalButtonDispatcher.sendRequest(elevatorId, floor);
	}
}
