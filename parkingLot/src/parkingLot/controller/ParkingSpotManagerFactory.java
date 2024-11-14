package parkingLot.controller;

import parkingLot.constants.VehicleType;
import parkingLot.model.vehicle.Vehicle;
import parkingLot.repository.FourWheelerParkingSpotManager;
import parkingLot.repository.ParkingSpotManager;
import parkingLot.repository.TwoWheelerParkingSpotManager;

public class ParkingSpotManagerFactory {
	private ParkingSpotManagerFactory() {}
	
	private static class ParkingSpotManagerFactorySingleton {
		private final static ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
	}
	
	public static ParkingSpotManagerFactory getParkingSpotManagaerFactory() {
		return ParkingSpotManagerFactorySingleton.parkingSpotManagerFactory;
	}

	public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
		if(vehicle.vehicleType == VehicleType.TWO_WHEELER) {
			return TwoWheelerParkingSpotManager.getTwoWheelerParkingSpotManager();
		}
		else if(vehicle.vehicleType == VehicleType.FOUR_WHEELER) {
			return FourWheelerParkingSpotManager.getFourWheelerParkingSpotManager();
		}
		return null;
	}
}
