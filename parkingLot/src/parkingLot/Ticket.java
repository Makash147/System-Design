package parkingLot;

import java.time.Instant;

public class Ticket {
	private ParkingSpot parkingSpot;
	private Instant entryTime;

	public Ticket(ParkingSpot parkingSpot) {
		this.entryTime = Instant.now();
		this.parkingSpot = parkingSpot;
	}
	
	public Instant getEntryTime() {
		return this.entryTime;
	}

	public ParkingSpot getParkingSpot() {
		return this.parkingSpot;
	}

}
