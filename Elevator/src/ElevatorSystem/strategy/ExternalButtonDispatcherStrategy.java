package ElevatorSystem.strategy;

import ElevatorSystem.controller.ElevatorController;

public interface ExternalButtonDispatcherStrategy {
	
	public ElevatorController getElevatorController();
}
