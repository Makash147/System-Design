package parkingLot;

public class EntryGate {
	private static EntryGate entryGate;
	private EntryGate() {
		System.out.println("Entry Gate created.");
	}
	public static EntryGate getEntryGateInstance() {
		if(entryGate == null) {
			synchronized (EntryGate.class) {
				if(entryGate == null) {
					entryGate = new EntryGate();
				}
			}
		}
		return entryGate;
	}
	public ParkingSpot bookParkingSpot(Vehicle vehicle) {
		ParkingSpotManagerFactory parkingSpotManagerFactory = ParkingSpotManagerFactory.getParkingSpotManagaerFactory();
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle);
		ParkingSpot parkingSpot = parkingSpotManager.getParkingSpot();
		if(parkingSpot == null) {
			System.out.println("Couldn't find a parking spot. Sorry!");
			return null;
		}
		parkingSpot.parkVehicle(vehicle);
		return parkingSpot;
	}
	public Ticket generateTicket(ParkingSpot parkingSpot) {
		return new Ticket(parkingSpot);
	}
}
