package parkingLot;

import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {

	public static void main(String[] args) {
		initialize();
		
		Vehicle akashVehicle = new Vehicle(1, VehicleType.TWO_WHEELER);
		if(processVehicleAtEntryGate(akashVehicle)) {
			System.out.println("Vehicle "+ akashVehicle +"entered parking lot.");
		}
		Vehicle shrivatsaVehicle = new Vehicle(2, VehicleType.TWO_WHEELER);
		if(processVehicleAtEntryGate(shrivatsaVehicle)) {
			System.out.println("Vehicle "+ shrivatsaVehicle +"entered parking lot.");
		}
		Vehicle jordanVehicle = new Vehicle(2, VehicleType.TWO_WHEELER);
		if(processVehicleAtEntryGate(shrivatsaVehicle)) {
			System.out.println("Vehicle "+ jordanVehicle +"entered parking lot.");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		processVehicleAtExitGate(akashVehicle);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		processVehicleAtExitGate(shrivatsaVehicle);
		// processVehicleAtExitGate(jordanVehicle);
		
		
	}

	public static void initialize() {
		
		ArrayList<ParkingSpot> twoWheelerParkingSpotList = 
				new ArrayList<>(Arrays.asList(new TwoWheelerParkingSpot(1), new TwoWheelerParkingSpot(2)));
		ArrayList<ParkingSpot> fourWheelerParkingSpotList = 
				new ArrayList<>(Arrays.asList(new FourWheelerParkingSpot(3), new FourWheelerParkingSpot(4)));
		
		TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = TwoWheelerParkingSpotManager.getTwoWheelerParkingSpotManager();
		twoWheelerParkingSpotManager.addParkingSpots(twoWheelerParkingSpotList);
		FourWheelerParkingSpotManager fourWheelerParkingSpotManager = FourWheelerParkingSpotManager.getFourWheelerParkingSpotManager();
		fourWheelerParkingSpotManager.addParkingSpots(fourWheelerParkingSpotList);
		
		
	}
	
	public static boolean processVehicleAtEntryGate(Vehicle vehicle) {
		EntryGate entryGate = EntryGate.getEntryGateInstance();
		ParkingSpot parkingSpot = entryGate.bookParkingSpot(vehicle);
		if(parkingSpot == null) {
			return false;
		}
		Ticket ticket = entryGate.generateTicket(parkingSpot);
		vehicle.setTicket(ticket);
		return true;
	}
	
	private static void processVehicleAtExitGate(Vehicle vehicle) {
		ExitGate exitGate = ExitGate.getExitGateInstance();
		exitGate.takePayment(vehicle);
		
	}

}
