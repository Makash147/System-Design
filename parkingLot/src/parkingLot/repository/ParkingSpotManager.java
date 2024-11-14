package parkingLot.repository;

import java.util.ArrayList;

import parkingLot.model.parking.ParkingSpot;
import parkingLot.strategy.ParkingStrategy;

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
			for(ParkingSpot parkingSpot:parkingSpotList) {
				if(parkingSpot.getParkingSpotAvailability()) {
					return parkingSpot;
				}
			}
		}
		return null;
	}
}
