package excelSheet;

import excelSheet.controller.ExcelSheetController;

public class ExcelSheet {

	public static void main(String[] args) {
		
		int r = 4, c = 4;
		ExcelSheetController.getExcelSheetController().initializeController(r,c);
		
		ExcelSheetController.getExcelSheetController().updateValueController(0,0, "10");
		
		ExcelSheetController.getExcelSheetController().updateValueController(1,0, "11");
		
		ExcelSheetController.getExcelSheetController().getValueController(0,0);
		
		ExcelSheetController.getExcelSheetController().getValueController(1,0);
		
		ExcelSheetController.getExcelSheetController().printExcelSheetController();
		
		int result = ExcelSheetController.getExcelSheetController().addFormulaeController(0,0,1,0,2,0);
		
		ExcelSheetController.getExcelSheetController().printExcelSheetController();
		
		ExcelSheetController.getExcelSheetController().updateValueController(1,0, "12");
		
		ExcelSheetController.getExcelSheetController().printExcelSheetController();
		
		
		System.out.println("result " + result);
		
	}

}
