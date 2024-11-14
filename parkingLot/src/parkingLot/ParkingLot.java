package parkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.tuple.Pair;

import parkingLot.constants.VehicleType;
import parkingLot.controller.EntryGateController;
import parkingLot.controller.ExitGateController;
import parkingLot.controller.ParkingSpotsController;
import parkingLot.controller.VehicleController;
import parkingLot.model.parking.FourWheelerParkingSpot;
import parkingLot.model.parking.ParkingSpot;
import parkingLot.model.parking.TwoWheelerParkingSpot;
import parkingLot.model.ticket.Ticket;
import parkingLot.model.vehicle.Vehicle;
import parkingLot.repository.FourWheelerParkingSpotManager;
import parkingLot.repository.TwoWheelerParkingSpotManager;

public class ParkingLot {

	public static void main(String[] args) {
		
		ArrayList<Pair<Integer, Integer>> op = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		ParkingSpotsController.getParkingSpotsController().initialize(scanner);
		
		System.out.println("Parking lot system started.");
		
		while(true) {
			System.out.println("\nEnter 'E' for entry, 'X' for exit, and 'Q' for closing the parking lot system.");
			String input = scanner.nextLine();
			
			switch(input) {
			
			case "E":
				handleEntry(scanner);
				break;
				
			case "X":
				handleExit(scanner);
				break;
			case "Q":
				System.out.println("Parking lot system is closed.");
				scanner.close();
				return;
			default:
				System.out.println("Invalid input. Please Enter 'E' for entry, 'X' for exit, and 'Q' for closing the parking lot system.");
				break;
			}
		}
	}
	
	private static void handleEntry(Scanner scanner) {
		System.out.println("Enter vehicle ID: ");
		int id = scanner.nextInt();
		System.out.println("Enter vehicle type (1 for Two_wheeler and 2 for Four_Wheeler): ");
		int type = scanner.nextInt();
		scanner.nextLine();
		
		Vehicle vehicle = new Vehicle(id, (type==1) ? VehicleType.TWO_WHEELER : VehicleType.FOUR_WHEELER);
		
		if(processVehicleAtEntryGate(vehicle)) {
			System.out.println("Vehicle "+ vehicle.getVehicleId() +" entered parking lot.");
			VehicleController.getVehicleController().addVehicle(vehicle);
		}
		else {
			System.out.println("Parking lot is full.");
		}
	}
	
	private static void handleExit(Scanner scanner) {
		System.out.println("Enter vehicle ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		Vehicle vehicle = findVehicleById(id);
		
		processVehicleAtExitGate(vehicle);
		System.out.println("Vehicle "+vehicle.getVehicleId() + " has exited the parking lot.");
	}
	
	private static boolean processVehicleAtEntryGate(Vehicle vehicle) {
		EntryGateController entryGate = EntryGateController.getEntryGateInstance();
		ParkingSpot parkingSpot = entryGate.bookParkingSpot(vehicle);
		if(parkingSpot == null) {
			return false;
		}
		Ticket ticket = entryGate.generateTicket(parkingSpot);
		// vehicle.setTicket(ticket);
		return true;
	}
	
	private static Vehicle findVehicleById(int vehicleId) {
		return VehicleController.getVehicleController().getVehicle(vehicleId);
	}
	
	private static void processVehicleAtExitGate(Vehicle vehicle) {
		ExitGateController exitGate = ExitGateController.getExitGateInstance();
		exitGate.takePayment(vehicle);
		VehicleController.getVehicleController().removeVehicle(vehicle.getVehicleId());
	}

}
