
public class ElevatorController {
	private Elevator elevator;
	
	public ElevatorController(int elevatorId) {
		this.elevator = new Elevator(elevatorId);
	}
	
	public void sendRequestToElevatorController(int floor, Direction direction) {
		// We can use some DS to store the requests and call sendRequestToElevator using some algorithm.
		// For simplicity, I'll call sendRequestToElevator() as soon as ElevatorController accepts any request.
		sendRequestToElevator(floor, direction);
	}
	
	public void sendRequestToElevator(int floor, Direction direction) {
		System.out.println("Sending request to Elevator.");
		elevator.processRequest(floor, direction);
	}

	public Elevator getElevator() {
		return this.elevator;
	}
}
