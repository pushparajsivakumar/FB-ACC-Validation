package org.base;

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

public class DataDrivenpart5 {
	public static void main(String[] args) throws IOException {
		// 1. mention excel sheet path
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\BaseClass\\excel\\Datas.xlsx");

		// 2.To read the file
		FileInputStream fis = new FileInputStream(f);

		// 3. To read .xlsx file format
		Workbook wb = new XSSFWorkbook(fis);

		// 4.Get Sheet From workbook
		Sheet mySheet = wb.getSheet("Datas");

		// 5. To iterate all rows
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row r = mySheet.getRow(i);
			// To iterate all cells for all Cells
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				// CellType == 1 --> string cell by default
				// cellType = other than 1 that is Datecell/numericalCell

				if (cellType == 1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date dd = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat(" dd-MMM-yyyy");
					String value = s.format(dd);
					System.out.println(value);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					String value = String.valueOf(l); // ValueOf - To Convert the value into String
					System.out.println(value);
				}
			}
		}

	}

}
