package parkingLot.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import parkingLot.ParkingLot;
import parkingLot.model.parking.TwoWheelerParkingSpot;
import parkingLot.model.parking.FourWheelerParkingSpot;
import parkingLot.model.parking.ParkingSpot;

public class ParkingSpotsRepository {
	
	private int twoWheelerParkingSpotId;
	private int fourWheelerParkingSpotId;
	
	private ParkingSpotsRepository() {
		twoWheelerParkingSpotId = 0;
		fourWheelerParkingSpotId = 0;
	}
	
	private static class ParkingSpotsRepositorySingleton {
		private final static ParkingSpotsRepository parkingSpotsRepositoryInstance = new ParkingSpotsRepository();
	}

	public static ParkingSpotsRepository getParkingSpotsRepository() {
		return ParkingSpotsRepositorySingleton.parkingSpotsRepositoryInstance;
	}

	public void initialize(Scanner scanner) {
		System.out.println("Enter the number of two wheeler parking spots to be created.");
		int noOfTwoWheelerParkingSpots = scanner.nextInt();
		
		ArrayList<ParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
		
		for(int i=0;i<noOfTwoWheelerParkingSpots;i++) {
			twoWheelerParkingSpots.add(new TwoWheelerParkingSpot(twoWheelerParkingSpotId++));
		}
		
		System.out.println("Enter the number of four wheeler parking spots to be created.");
		int noOfFourWheelerParkingSpots = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<ParkingSpot> fourWheelerParkingSpots = new ArrayList<>();
		
		for(int i=0;i<noOfFourWheelerParkingSpots;i++) {
			fourWheelerParkingSpots.add(new FourWheelerParkingSpot(fourWheelerParkingSpotId++));
		}
		
		TwoWheelerParkingSpotManager.getTwoWheelerParkingSpotManager().addParkingSpots(twoWheelerParkingSpots);
		FourWheelerParkingSpotManager.getFourWheelerParkingSpotManager().addParkingSpots(fourWheelerParkingSpots);
		
	}

}
