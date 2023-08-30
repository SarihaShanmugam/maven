package org.stringFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StringFormat {

	private static String value;

	public static void main(String[] args) throws IOException {
		File f = new File("F:\\workspace-new\\MavenDemo\\XL sheet\\xl sheet1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Sheet1");
		Row r= s.getRow(1);
		Cell c = r.getCell(1);
		int ct = c.getCellType();		
		
			if(ct==1) {
			value = c.getStringCellValue();
				System.out.println(value);
				
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
					value= sdf.format(dateCellValue);
					
					System.out.println(value);
					
				}
				else {
					double numericCellValue = c.getNumericCellValue();
					long l=(long)numericCellValue;
				value=String.valueOf(1);
			}
		}
	

}
