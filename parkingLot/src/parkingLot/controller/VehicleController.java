package parkingLot.controller;

import parkingLot.model.vehicle.Vehicle;
import parkingLot.repository.VehicleRepository;

public class VehicleController {
	
	private static class VehicleControllerSingleton {
		private final static VehicleController vehicleControllerInstance = new VehicleController();
	}

	public static VehicleController getVehicleController() {
		return VehicleControllerSingleton.vehicleControllerInstance;
	}
	
	public void addVehicle(Vehicle vehicle) {
		VehicleRepository.getVehicleRepository().addVehicle(vehicle);
	}
	
	public Vehicle getVehicle(int vehicleId) {
		return VehicleRepository.getVehicleRepository().getVehicle(vehicleId);
	}
	
	public void removeVehicle(int vehicleId) {
		VehicleRepository.getVehicleRepository().removeVehicle(vehicleId);
	}
}
