package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {

	String value;
	public void excelWrite(int sheetNo, int rowVal, int cellVal, String data) throws IOException {

		// load excel file
		FileInputStream load = new FileInputStream(
				"C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj17thSep2022\\Velocity.xlsx");

		// access the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(load);

		// get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);

		// perform output action on output stream
		FileOutputStream writeOuput = new FileOutputStream(
				"C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj17thSep2022\\Velocity.xlsx");
		sheet1.createRow(rowVal).createCell(cellVal).setCellValue(data);
		workbook.write(writeOuput);
	}

	public String excelRead(int sheetNo, int rowVal, int cellVal) throws IOException {

		// load excel file
		FileInputStream load = new FileInputStream(
				"C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj17thSep2022\\Velocity.xlsx");

		// workbook of excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);

		// get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);

		// read cell
		 CellType type = sheet1.getRow(rowVal).getCell(cellVal).getCellType();
		 
		 if(type== CellType.NUMERIC) {
			 double number = sheet1.getRow(rowVal).getCell(cellVal).getNumericCellValue();
			 int num = (int)number;
			 value = String.valueOf(num);
		 }
		 else {
			 value = sheet1.getRow(rowVal).getCell(cellVal).getStringCellValue(); 
		 }
			
		 return value;
	}
}











