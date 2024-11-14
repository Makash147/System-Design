package parkingLot.repository;

import java.util.HashMap;

import parkingLot.controller.VehicleController;
import parkingLot.model.vehicle.Vehicle;

public class VehicleRepository {
	
	HashMap<Integer, Vehicle> vehicleIdToVehicle = new HashMap<>();
	
	private static class VehicleRepositorySingleton {
		private final static VehicleRepository vehicleRepositoryInstance = new VehicleRepository();
	}

	public static VehicleRepository getVehicleRepository() {
		return VehicleRepositorySingleton.vehicleRepositoryInstance;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicleIdToVehicle.put(vehicle.getVehicleId(), vehicle);
	}
	
	public Vehicle getVehicle(int vehicleId) {
		return vehicleIdToVehicle.get(vehicleId);
	}
	
	public void removeVehicle(int vehicleId) {
		vehicleIdToVehicle.remove(vehicleId);
	}

}
