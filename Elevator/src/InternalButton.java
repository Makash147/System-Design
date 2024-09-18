
public class InternalButton {
	private int elevatorId;
	
	public InternalButton(int elevatorId) {
		this.elevatorId = elevatorId;
	}
	
	public void sendRequest(int floor) {
		InternalButtonDispatcher internalButtonDispatcher = InternalButtonDispatcher.getInternalButtonDispatcherInstance();
		internalButtonDispatcher.sendRequestToInternalButtonDispatcher(elevatorId, floor);
	}
}
