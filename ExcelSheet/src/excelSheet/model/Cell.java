package excelSheet.model;

import excelSheet.Constants.CellFormat;

public class Cell {
	String data;
	CellFormat cellFormat;
	
	public Cell() {
		this.data = "";
		this.cellFormat = CellFormat.DEFAULT;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void putData(String data) {
		this.data = data;                            // C2.data + C3.data
	}
	
	public CellFormat getCellFormat() {
		return this.cellFormat;
	}
	
	public void putCellFormat(CellFormat cellFormat) {
		this.cellFormat = cellFormat;
	}
}
