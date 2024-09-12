package parkingLot;

public class Vehicle {
	int vehicleId;
	VehicleType vehicleType;
	Ticket ticket;
	
	public Vehicle(int vehicleId, VehicleType vehicleType) {
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;	
	}
	
	public Ticket getTicket() {
		return this.ticket;
	}
}
