package SnakeAndLadder.repository;

import java.util.LinkedList;
import java.util.Queue;

import SnakeAndLadder.controller.GameController;
import SnakeAndLadder.model.Board;
import SnakeAndLadder.model.Cell;
import SnakeAndLadder.model.Dice;
import SnakeAndLadder.model.Jump;
import SnakeAndLadder.model.Player;

public class GameRepository {
	
	Board board;
	Dice dice;
	Queue<Player> players = new LinkedList<>();
	Player winner;
	
	enum SnakeLadder {
		SNAKE,
		LADDER
	}
	
	private static class GameRepositorySingleton {
		private final static GameRepository gameRepositoryInstance= new GameRepository();
	}

	public static GameRepository getGameRepository() {
		return GameRepositorySingleton.gameRepositoryInstance;
	}

	public void initialize(int boardSize, int noOfSnakes, int noOfLadders, int noOfDice, int noOfPlayers) {
		board = new Board(boardSize);
		addJump(noOfSnakes, boardSize, SnakeLadder.SNAKE);
		addJump(noOfLadders, boardSize, SnakeLadder.LADDER);
		addPlayers(noOfPlayers);
		dice = new Dice(noOfDice);
	}

	private void addJump(int noOfSnakes, int boardSize, SnakeLadder snakeLadder) {
		for(int i=0;i<noOfSnakes;i++) {
			int min = 2, max = boardSize*boardSize-1;
			int start = (int)(Math.random()*(max-min+1)) + min;
			int end = (int)(Math.random()*(max-min+1)) + min;
			if(snakeLadder == SnakeLadder.SNAKE) {
				if(start<=end) {
					i--;
					continue;
				}
			}
			else {
				if(start>=end) {
					i--;
					continue;
				}
			}
			Jump jump = new Jump(start, end);
			Cell cell = getCell(start, boardSize);
			cell.putJump(jump);
		}
	}

	public Cell getCell(int start, int boardSize) {
		int row = (start-1)/boardSize;
		int col;
		if(row%2!=0) {
			col = boardSize-1-(start-1)%boardSize;
		}
		else {
			col = (start-1)%boardSize;
		}

		Cell cell = board.getCell(row, col);
		return cell;
	}
	
	private void addPlayers(int noOfPlayers) {
		for(int i=0;i<noOfPlayers;i++) {
			Player player = new Player(i, 0);
			players.add(player);
		}
	}

	public Player getWinner() {
		return this.winner;
	}

	public void setWinner(Player player) {
		this.winner = player;
	}

	public Player getRemoveAndAddPlayer() {
		Player player = players.poll();
		players.add(player);
		return player;
	}

	public Dice getDice() {
		return this.dice;
	}
}
