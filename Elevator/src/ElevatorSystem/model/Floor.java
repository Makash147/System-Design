package ElevatorSystem.model;

public class Floor {
	
	ExternalButton externalButton;
	
	public Floor() {
		this.externalButton = new ExternalButton();
	}

	public ExternalButton getExternalButton() {
		return this.externalButton;
	}

}
