package parkingLot;

import java.util.ArrayList;

public class ParkingSpotManager {
	private ArrayList<ParkingSpot> parkingSpotList = new ArrayList<>();
	private ParkingStrategy parkingStrategy;
	
	protected ParkingSpotManager() {}
	
	public void addParkingSpots(ArrayList<ParkingSpot> parkingSpotList) {
		for(ParkingSpot parkingSpot:parkingSpotList) {
			this.parkingSpotList.add(parkingSpot);
		}
	}
	
	public void removeParkingSpots(ArrayList<ParkingSpot> parkingSpotList) {
		for(ParkingSpot parkingSpot:parkingSpotList) {
			if(this.parkingSpotList.contains(parkingSpot)) {
				this.parkingSpotList.remove(parkingSpot);
			}
		}
	}

	public ParkingSpot getParkingSpot() {
		if(!parkingSpotList.isEmpty()) {
			return parkingSpotList.remove(0);
		}
		return null;
	}
}
