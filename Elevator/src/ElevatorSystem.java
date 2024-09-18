import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
	
	private static List<Elevator> listOfElevatorControllers = new ArrayList<>();
	private static ExternalButton externalButton = new ExternalButton();

	public static void main(String[] args) {
		initialize();
		
		listOfElevatorControllers.get(0).getInternalButton().sendRequest(9);
		listOfElevatorControllers.get(1).getInternalButton().sendRequest(19);
		
		externalButton.sendRequest(0, Direction.DOWN);
	}
	
	public static void initialize() {
		InternalButtonDispatcher internalButtonDispatcher = InternalButtonDispatcher.getInternalButtonDispatcherInstance();
		ElevatorController elevatorControllerOne = new ElevatorController(1);
		listOfElevatorControllers.add(elevatorControllerOne.getElevator());
		internalButtonDispatcher.addElevatorController(elevatorControllerOne);
		DefaultStrategy.addElevatorController(elevatorControllerOne);
		
		ElevatorController elevatorControllerTwo = new ElevatorController(2);
		listOfElevatorControllers.add(elevatorControllerTwo.getElevator());
		internalButtonDispatcher.addElevatorController(elevatorControllerTwo);
		DefaultStrategy.addElevatorController(elevatorControllerTwo);
	}

}
