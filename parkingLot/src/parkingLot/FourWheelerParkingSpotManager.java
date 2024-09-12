package parkingLot;

import java.util.ArrayList;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

	private FourWheelerParkingSpotManager() {}
	
	private static class FourWheelerParkingSpotManagerSingleton {
		private static final FourWheelerParkingSpotManager fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager();
	}
	
	public static FourWheelerParkingSpotManager getFourWheelerParkingSpotManager() {
		return FourWheelerParkingSpotManagerSingleton.fourWheelerParkingSpotManager;
	}
}
