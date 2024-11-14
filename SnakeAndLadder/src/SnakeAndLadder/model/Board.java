package SnakeAndLadder.model;

import java.util.ArrayList;

import SnakeAndLadder.repository.GameRepository;

public class Board {
	
	ArrayList<ArrayList<Cell>> cells = new ArrayList<>();
	
	public Board(int size) {
		for(int i=0;i<size;i++) {
			ArrayList<Cell> innerList = new ArrayList<>();
			for(int j=0;j<size;j++) {
				Cell cell = new Cell();
				innerList.add(cell);
			}
			cells.add(innerList);
		}
	}

	public Cell getCell(int row, int col) {
		return cells.get(row).get(col);
	}
}
