package ElevatorSystem.controller;

import ElevatorSystem.constants.Direction;
import ElevatorSystem.strategy.DefaultStrategy;

public class ExternalButtonDispatcher {
	static DefaultStrategy strategy = new DefaultStrategy();

	public static void sendRequest(int floor, Direction direction) {
		ElevatorController elevatorController = strategy.getElevatorController();
		elevatorController.sendRequest(floor, direction);
	}
}
