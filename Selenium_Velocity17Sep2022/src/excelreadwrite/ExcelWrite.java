package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		//get path of excel
		File path= new File("C:\\Users\\avdhu\\OneDrive\\Desktop\\Class\\Katraj17thSep2022\\Velocity.xlsx");
		
		//load excel file
		FileInputStream load= new FileInputStream(path);
		
		//access the workbook
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		
		//get sheet from workbook
		XSSFSheet sheet1= workbook.getSheetAt(0);
		
		//perform output action on output stream
		FileOutputStream writeOuput= new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("Velocity");
		workbook.write(writeOuput);
	}
}
