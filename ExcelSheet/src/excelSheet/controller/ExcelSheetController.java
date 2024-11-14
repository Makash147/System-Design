package excelSheet.controller;

import excelSheet.excelSheetRepository.ExcelSheetRepository;

public class ExcelSheetController {
	
	private static class ExcelSheetControllerSingleton {
		private final static ExcelSheetController excelSheetControllerInstance = new ExcelSheetController();
	}
	
	public static ExcelSheetController getExcelSheetController() {
		return ExcelSheetControllerSingleton.excelSheetControllerInstance;
	}
	
	public void initializeController(int r, int c) {
		ExcelSheetRepository.getExcelSheetRepository().initializeRepository(r, c);
	}
	
	public void printExcelSheetController() {
		ExcelSheetRepository.getExcelSheetRepository().printExcelSheetRepository();
	}
	
	public void updateValueController(int x, int y, String data) {
		ExcelSheetRepository.getExcelSheetRepository().updateValueRepository(x, y, data);
	}
	
	public String getValueController(int x, int y) {
		return ExcelSheetRepository.getExcelSheetRepository().getValueRepository(x, y);
	}
	
	public int addFormulaeController(int x1, int y1, int x2, int y2, int resultx1, int resulty1) {
		return ExcelSheetRepository.getExcelSheetRepository().addFormulaeRepository(x1, y1, x2, y2, resultx1, resulty1);
	}
	
	public int addFormulaeRangeController(int x1, int x2, int c) {
		return ExcelSheetRepository.getExcelSheetRepository().addFormulaeRangeRepository(x1, x2, c);
	}
}
