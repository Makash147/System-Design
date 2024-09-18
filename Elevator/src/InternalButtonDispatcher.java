import java.util.HashMap;
import java.util.Map;

public class InternalButtonDispatcher {
	private Map<Integer, ElevatorController> elevatorIdToElevatorControllerMap = new HashMap<>();
	
	private InternalButtonDispatcher() {
		System.out.println("Internal button dispatcher created.");
	}
	
	private static class internalButtonDispatcherSingleton {
		private final static InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();
	}
	
	public static InternalButtonDispatcher getInternalButtonDispatcherInstance() {
		return internalButtonDispatcherSingleton.internalButtonDispatcher;
	}
	
	public void addElevatorController(ElevatorController elevatorController) {
		elevatorIdToElevatorControllerMap.put(elevatorController.getElevator().getElevatorId(), elevatorController);
	}

	public void sendRequestToInternalButtonDispatcher(int elevatorId, int floor) {
		ElevatorController elevatorController = elevatorIdToElevatorControllerMap.get(elevatorId);
		elevatorController.sendRequestToElevatorController(floor, null);
	}
}
