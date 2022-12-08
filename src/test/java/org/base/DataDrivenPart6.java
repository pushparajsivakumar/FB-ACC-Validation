package org.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenPart6 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\newFile.xlsx"); //Excel File Folder Location
		Workbook w = new XSSFWorkbook();  
		Sheet NewSheet = w.createSheet("datas1");   //Create Excel Sheet
		Row newRow = NewSheet.createRow(0);         //Create Row
		Cell newCell = newRow.createCell(0);		//Crete Cell 
		newCell.setCellValue("Pushparaj Sivakumar");        //Setting  value to cell
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
	}

}
