package SnakeAndLadder.model;

public class Cell {
	
	Jump jump;
	
	public void putJump(Jump jump) {
		this.jump = jump;
	}

	public Jump getJump() {
		return this.jump;
	}
}
