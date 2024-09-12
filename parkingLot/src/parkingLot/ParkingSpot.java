package parkingLot;

public class ParkingSpot {
	private int parkingId;
	private boolean isAvailable;
	private Vehicle vehicle;
	private int hourlyParkingRate;
	private int minutewiseParkingRate;
	
	ParkingSpot(int parkingId, int hourlyParkingRate, int minutewiseParkingRate){
		this.parkingId = parkingId;
		this.hourlyParkingRate = hourlyParkingRate;
		this.minutewiseParkingRate = minutewiseParkingRate;
		this.isAvailable = true;
	}
	
	public void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.isAvailable = false;
	}
	
	public void freeUpParkingSpot() {
		this.vehicle = null;
		this.isAvailable = true;
	}

	public int getMinuteWiseParkingRate() {
		return this.minutewiseParkingRate;
	}
}
