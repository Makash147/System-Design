package ElevatorSystem.repository;

import java.util.ArrayList;
import java.util.HashMap;

import ElevatorSystem.controller.ElevatorController;
import ElevatorSystem.model.ExternalButton;
import ElevatorSystem.model.Floor;
import ElevatorSystem.model.InternalButton;

public class ElevatorSystemRepository {
	
	ArrayList<Floor> floors = new ArrayList<>();
	HashMap<Integer, Floor> floorMap = new HashMap<>();
	
	ArrayList<ElevatorController> elevatorControllers = new ArrayList<>();
	HashMap<Integer, ElevatorController> elevatorControllerMap = new HashMap<>();
	
	
	
	private static class ElevatorSystemRepositorySingleton {
		private final static ElevatorSystemRepository elevatorSystemRepositoryInstance = new ElevatorSystemRepository();
	}

	public static ElevatorSystemRepository getElevatorSystemRepository() {
		return ElevatorSystemRepositorySingleton.elevatorSystemRepositoryInstance;
	}
	
	public void initialize(int noOfFloors, int noOfElevators) {
		
		for(int i=0;i<noOfFloors;i++) {
			Floor floor = new Floor();
			floors.add(floor);
			floorMap.put(i, floor);
		}
		
		for(int i=0;i<noOfElevators;i++) {
			ElevatorController elevatorController = new ElevatorController(i);
			elevatorControllers.add(elevatorController);
			elevatorControllerMap.put(i, elevatorController);
		}
	}

	public ElevatorController getElevatorController(int elevatorId) {
		return elevatorControllerMap.get(elevatorId);
	}

	public ExternalButton getExternalButton(int floorId) {
		return floorMap.get(floorId).getExternalButton();
	}

	public InternalButton getInternalButton(int elevatorId) {
		return elevatorControllerMap.get(elevatorId).getElevator().getInternalButton();
	}

}
