
public class ExternalButton {
	
	public void sendRequest(int floor, Direction direction) {
		ExternalButtonDispatcher externalButtonDispatcher = ExternalButtonDispatcher.getExternalButtonDispatcherInstance();
		externalButtonDispatcher.sendRequestToExternalButtonDispatcher(floor, direction);
	}
}
