package ElevatorSystem.strategy;
import java.util.ArrayList;
import java.util.List;

import ElevatorSystem.controller.ElevatorController;
import ElevatorSystem.repository.ElevatorSystemRepository;

public class DefaultStrategy implements ExternalButtonDispatcherStrategy {
	
	@Override
	public ElevatorController getElevatorController() {
		int elevatorId = 0;
		return ElevatorSystemRepository.getElevatorSystemRepository().getElevatorController(elevatorId);
	}
}
