package parkingLot.controller;

import java.time.Duration;
import java.time.Instant;

import parkingLot.model.parking.ParkingSpot;
import parkingLot.model.ticket.Ticket;
import parkingLot.model.vehicle.Vehicle;

public class ExitGateController {
	private ExitGateController() {}
	
	private static class ExitGateSingleton {
		private final static ExitGateController exitGate = new ExitGateController();
	}
	
	public static ExitGateController getExitGateInstance() {
		return ExitGateSingleton.exitGate;
	}
	
	public void takePayment(Vehicle vehicle) {
		long price = calculatePrice(vehicle);
		boolean paymentDone = payment(price);
		if(paymentDone) {
			System.out.println("Thank you!");
		}
	}
	
	private long calculatePrice(Vehicle vehicle) {
		Ticket ticket = vehicle.getTicket();
		ParkingSpot parkingSpot = ticket.getParkingSpot();
		Instant entryTime = ticket.getEntryTime();
		Instant exitTime = Instant.now();
		int minuteWiseParkingRate = parkingSpot.getMinuteWiseParkingRate();
		Duration duration = Duration.between(entryTime, exitTime);
		long minutes = duration.toSeconds();
		
		return minutes*minuteWiseParkingRate;
	}
	
	private boolean payment(long price) {
		System.out.printf("%d rs. received\n", price);
		return true;
	}
}
