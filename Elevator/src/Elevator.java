
public class Elevator {
	
	private int elevatorId;
	private InternalButton internalButton;
	
	public Elevator(int elevatorId) {
		this.elevatorId = elevatorId;
		this.internalButton = new InternalButton(elevatorId);
	}
	
	public void processRequest(int floor, Direction direction) {
		System.out.println("Traveling to floor"+ floor+ " in "+ direction +"wards direction.");
	}

	public int getElevatorId() {
		return elevatorId;
	}

	public InternalButton getInternalButton() {
		return internalButton;
	}
}
