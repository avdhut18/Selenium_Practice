package excelreadwrite;

import java.io.IOException;

public class ExecutionCheck {

	public static void main(String[] args) throws IOException {
		ExcelReadWriteUtility utWrite = new ExcelReadWriteUtility();
		System.out.println(utWrite.excelRead(0, 1, 0));
		System.out.println(utWrite.excelRead(0, 2, 0));
	}
	
	
}
