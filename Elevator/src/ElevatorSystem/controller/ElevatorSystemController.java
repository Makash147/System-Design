package ElevatorSystem.controller;

import ElevatorSystem.repository.ElevatorSystemRepository;

import java.util.Scanner;

import ElevatorSystem.ElevatorSystem;
import ElevatorSystem.constants.Direction;

public class ElevatorSystemController {
	
	public static void initialize(int noOfFloors, int noOfElevators) {
		ElevatorSystemRepository.getElevatorSystemRepository().initialize(noOfFloors, noOfElevators);
	}
	
	public static void handleInternalButton(Scanner scanner) {
		System.out.println("Enter the elevator ID of an elevator you've entered into: ");
		int elevatorId = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the floor you want to travel to: ");
		int floor = scanner.nextInt();
		scanner.nextLine();
		
		ElevatorSystemRepository.getElevatorSystemRepository().getInternalButton(elevatorId).sendRequest(elevatorId, floor);
	}
	
	public static void handleExternalButton(Scanner scanner) {
		System.out.println("Enter the floor you are currently on: ");
		int floor = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the direction you want to travel to('U' for travelling up and 'D' for travelling down): ");
		String input = scanner.nextLine();

		Direction direction;
		
		if(input.equals("U")) {
			direction = Direction.UP;
		}
		else if(input.equals("D")) {
			direction = Direction.DOWN;
		}
		else {
			System.out.println("Entered invalid input. Please try again.");
			return;
		}
				
		ElevatorSystemRepository.getElevatorSystemRepository().getExternalButton(floor).sendRequest(floor, direction);
	}

}
