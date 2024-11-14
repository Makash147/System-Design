package SnakeAndLadder.controller;

import java.util.Scanner;

import SnakeAndLadder.model.Cell;
import SnakeAndLadder.model.Dice;
import SnakeAndLadder.model.Jump;
import SnakeAndLadder.model.Player;
import SnakeAndLadder.repository.GameRepository;

public class GameController {
	static Scanner scanner = new Scanner(System.in);
	static int noOfPlayers;
	static int boardSize;

	public static void initialize() {
		
		System.out.println("Enter the board size: ");
		boardSize = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the number of snakes: ");
		int noOfSnakes = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the number of ladders: ");
		int noOfLadders = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the number of dice: ");
		int noOfDice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the number of players: ");
		noOfPlayers = scanner.nextInt();
		scanner.nextLine();	
		
		GameRepository.getGameRepository().initialize(boardSize, noOfSnakes, noOfLadders, noOfDice, noOfPlayers);
		
	}

	public static void startGame() {
		System.out.println("Game Started.");
		while(GameRepository.getGameRepository().getWinner() == null) {
			Dice dice = GameRepository.getGameRepository().getDice();
			
			for(int i=0;i<noOfPlayers;i++) {
				Player player = GameRepository.getGameRepository().getRemoveAndAddPlayer();
				
				System.out.println("\nEnter any key to roll the dice.");
				String input = scanner.nextLine();
				
				int addPosition = dice.rollDice();		
				int newPosition = player.getCurrentPosition() + addPosition;
				
				if(newPosition >= boardSize*boardSize) {
					GameRepository.getGameRepository().setWinner(player);
					System.out.println("Player " + player.getId() + " has won the game.");
					scanner.close();
					return;
				}
				
				newPosition = checkAndApplyJump(player, newPosition);
				player.setCurrentPosition(newPosition);
				System.out.println("New position of player " + player.getId() + " is " + newPosition);
			}
		}
	}

	private static int checkAndApplyJump(Player player, int newPosition) {
		Cell cell = GameRepository.getGameRepository().getCell(newPosition, boardSize);
		Jump jump = cell.getJump();
		if(jump != null) {
			int start = newPosition;
			int end = jump.getEnd();
			String jumper;
			if(start<end) {
				jumper = "Ladder";
			}
			else {
				jumper = "Snake";
			}
			System.out.println("Player " + player.getId() +" jumped to " + end + " from " + start + " by a " + jumper);
			return end;
		}
		return newPosition;
	}

}
