package parkingLot.controller;

import parkingLot.model.parking.ParkingSpot;
import parkingLot.model.ticket.Ticket;
import parkingLot.model.vehicle.Vehicle;
import parkingLot.repository.ParkingSpotManager;

public class EntryGateController {
	
	private static EntryGateController entryGate;
	
	private EntryGateController() {}
	
	public static EntryGateController getEntryGateInstance() {
		if(entryGate == null) {
			synchronized (EntryGateController.class) {
				if(entryGate == null) {
					entryGate = new EntryGateController();
				}
			}
		}
		return entryGate;
	}
	
	public ParkingSpot bookParkingSpot(Vehicle vehicle) {
		ParkingSpotManagerFactory parkingSpotManagerFactory = ParkingSpotManagerFactory.getParkingSpotManagaerFactory();
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle);
		ParkingSpot parkingSpot = parkingSpotManager.getParkingSpot();
		if(parkingSpot == null) {
			System.out.println("Sorry. Couldn't find a parking spot.");
			return null;
		}
		parkingSpot.parkVehicle(vehicle);
		return parkingSpot;
	}
	
	public Ticket generateTicket(ParkingSpot parkingSpot) {
		return new Ticket(parkingSpot);
	}
}
