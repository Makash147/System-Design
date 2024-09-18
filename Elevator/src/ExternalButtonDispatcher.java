
public class ExternalButtonDispatcher {
	ExternalButtonDispatcherStrategy externalButtonDispatcherStrategy;
	
	private ExternalButtonDispatcher(ExternalButtonDispatcherStrategy externalButtonDispatcherStrategy) {
		this.externalButtonDispatcherStrategy = externalButtonDispatcherStrategy;
		System.out.println("External button dispatcher created.");
	}
	
	private static class externalButtonDispatcherSingleton {
		private final static ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher(new DefaultStrategy());
	}
	
	public static ExternalButtonDispatcher getExternalButtonDispatcherInstance() {
		return externalButtonDispatcherSingleton.externalButtonDispatcher;
	}

	public void sendRequestToExternalButtonDispatcher(int floor, Direction direction) {
		ElevatorController elevatorController = externalButtonDispatcherStrategy.getElevatorController();
		elevatorController.sendRequestToElevatorController(floor, direction);
	}
}
