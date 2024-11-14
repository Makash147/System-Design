package parkingLot.model.vehicle;

import parkingLot.constants.VehicleType;
import parkingLot.model.ticket.Ticket;

public class Vehicle {
	int vehicleId;
	public VehicleType vehicleType;
	
	public Vehicle(int vehicleId, VehicleType vehicleType) {
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
	}

	public int getVehicleId() {
		return this.vehicleId;
	}
}
