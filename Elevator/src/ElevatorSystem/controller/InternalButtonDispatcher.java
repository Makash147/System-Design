package ElevatorSystem.controller;

import ElevatorSystem.repository.ElevatorSystemRepository;

public class InternalButtonDispatcher {
	
	private InternalButtonDispatcher() {
		System.out.println("Internal button dispatcher created.");
	}

	public static void sendRequest(int elevatorId, int floor) {
		ElevatorSystemRepository.getElevatorSystemRepository().getElevatorController(elevatorId).sendRequest(floor, null);
	}
}
