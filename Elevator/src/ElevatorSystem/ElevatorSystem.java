package ElevatorSystem;

import java.util.Scanner;

import ElevatorSystem.controller.ElevatorSystemController;

public class ElevatorSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of floors in the building: ");
		int noOfFloors = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the number of elevators to be created: ");
		int noOfElevators = scanner.nextInt();
		scanner.nextLine();
		
		ElevatorSystemController.initialize(noOfFloors, noOfElevators);
		
		System.out.println("Elevator system has started.");
		
		while(true) {
			System.out.println("\nEnter 'I' for for pressing an internal button, 'E' for pressing an external button, and 'Q' for stopping the elevator system.");
			
			String input = scanner.nextLine();
			
			switch(input) {
			case "I":
				ElevatorSystemController.handleInternalButton(scanner);
				break;
				
			case "E":
				ElevatorSystemController.handleExternalButton(scanner);
				break;
				
			case "Q":
				scanner.close();
				System.out.println("Elevator system has been stopped.");
				return;
				
			default:
				System.out.println("Entered invalid input.");
				break;
			}
		}
	}
}
