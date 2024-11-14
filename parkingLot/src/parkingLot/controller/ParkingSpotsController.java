package parkingLot.controller;

import java.util.Scanner;

import parkingLot.ParkingLot;
import parkingLot.repository.ParkingSpotsRepository;

public class ParkingSpotsController {
	
	private static class ParkingSpotsControllerSingleton {
		private final static ParkingSpotsController parkingSpotsControllerInstance = new ParkingSpotsController();
	}

	public static ParkingSpotsController getParkingSpotsController() {
		return ParkingSpotsControllerSingleton.parkingSpotsControllerInstance;
	}

	public void initialize(Scanner scanner) {
		ParkingSpotsRepository.getParkingSpotsRepository().initialize(scanner);
		
	}

}
