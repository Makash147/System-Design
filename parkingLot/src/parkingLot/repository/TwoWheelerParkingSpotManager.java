package parkingLot.repository;

import java.util.ArrayList;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
	
	private TwoWheelerParkingSpotManager() {}
	
	private static class TwoWheelerParkingSpotManagerSingleton {
		private static final TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager();
	}
	
	public static TwoWheelerParkingSpotManager getTwoWheelerParkingSpotManager() {
		return TwoWheelerParkingSpotManagerSingleton.twoWheelerParkingSpotManager;
	}
}
	
