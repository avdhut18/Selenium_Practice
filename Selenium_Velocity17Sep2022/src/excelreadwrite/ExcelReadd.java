package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadd {

	public static void main(String[] args) throws IOException {
		//get path of excel
		File path = new File("C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj17thSep2022\\Velocity.xlsx");
		
		//load excel file
		FileInputStream load= new FileInputStream(path);
		
		//workbook of excel 
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		//read cell
		double data = sheet1.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data);
	}
}
