package org.stringFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewSheet {

	public static void main(String[] args) throws IOException {
		File f = new File("F:\\workspace-new\\MavenDemo\\XL sheet\\newSheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook b= new XSSFWorkbook(fis);	
		
		Sheet sheet = b.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equals("sariha")) {
			cell.setCellValue("pranav");
		}
FileOutputStream fos = new FileOutputStream(f);
b.write(fos);
return;
}
}