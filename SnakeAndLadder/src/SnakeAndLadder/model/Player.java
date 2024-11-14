package SnakeAndLadder.model;

public class Player {
	int playerId;
	int currentPosition;
	
	public Player(int playerId, int currentPosition) {
		this.playerId = playerId;
		this.currentPosition = currentPosition;
	}

	public int getId() {
		return this.playerId;
	}

	public int getCurrentPosition() {
		return this.currentPosition;
	}

	public void setCurrentPosition(int newPosition) {
		this.currentPosition = newPosition;
	}
}
