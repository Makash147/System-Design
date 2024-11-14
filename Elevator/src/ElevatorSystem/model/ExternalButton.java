package ElevatorSystem.model;

import ElevatorSystem.constants.Direction;
import ElevatorSystem.controller.ExternalButtonDispatcher;

public class ExternalButton {
	
	public void sendRequest(int floor, Direction direction) {
		ExternalButtonDispatcher.sendRequest(floor, direction);
	}
}
