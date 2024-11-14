package SnakeAndLadder.model;

public class Dice {
	int noOfDice;
	int min = 1;
	int max = 6;
	
	public Dice(int noOfDice) {
		this.noOfDice = noOfDice;
	}
	
	public int rollDice() {
		int sum = 0;
		for(int i=0;i<noOfDice;i++) {
			sum += (int)(Math.random()*(max-min+1)) + min;
		}
		return sum;
	}
}
