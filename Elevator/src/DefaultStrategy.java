import java.util.ArrayList;
import java.util.List;

public class DefaultStrategy implements ExternalButtonDispatcherStrategy {

	private static List<ElevatorController> elevatorControllerList = new ArrayList<>();
	
	@Override
	public ElevatorController getElevatorController() {
		return elevatorControllerList.get(0);
	}
	
	public static void addElevatorController(ElevatorController elevatorController) {
		elevatorControllerList.add(elevatorController);
	}
}
