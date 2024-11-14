package excelSheet.excelSheetRepository;

import java.util.ArrayList;

import excelSheet.model.Cell;

public class ExcelSheetRepository {
	ArrayList<ArrayList<Cell>> excelSheetCells = new ArrayList<>();
	
	private static class ExcelSheetRepositorySingleton {
		private final static ExcelSheetRepository excelSheetRepositoryInstance = new ExcelSheetRepository();
	}

	public static ExcelSheetRepository getExcelSheetRepository() {
		return ExcelSheetRepositorySingleton.excelSheetRepositoryInstance;
	}
	
	public void initializeRepository(int r, int c) {
		for(int i=0;i<r;i++) {
			ArrayList<Cell> innerList = new ArrayList<>();
			for(int j=0;j<c;j++) {
				innerList.add(new Cell());
			}
			excelSheetCells.add(innerList);
		}
	}

	public void updateValueRepository(int x, int y, String data) {
		excelSheetCells.get(x).get(y).putData(data);
	}

	public String getValueRepository(int x, int y) {
		return excelSheetCells.get(x).get(y).getData();
	}

	public int addFormulaeRepository(int x1, int y1, int x2, int y2, int resultx1, int resulty1) {
		int int1 = Integer.parseInt(excelSheetCells.get(x1).get(y1).getData());
		int int2 = Integer.parseInt(excelSheetCells.get(x2).get(y2).getData());
		updateValueRepository(resultx1, resulty1, String.valueOf(int1+int2));
		return int1+int2;
	}

	public int addFormulaeRangeRepository(int x1, int x2, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printExcelSheetRepository() {
		for(ArrayList<Cell> x:excelSheetCells) {
			for(Cell cell:x) {
				String data = cell.getData();
				System.out.print(data + " - ");
			}
			System.out.println();
		}
	}
	
	
	
}
