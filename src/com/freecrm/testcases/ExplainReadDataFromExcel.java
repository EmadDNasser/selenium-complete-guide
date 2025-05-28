package com.freecrm.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExplainReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// Correct the file path (no extra quotes inside)
        File file = new File("D:\\TestData.xlsx");
        
        // Read the file
        FileInputStream fis = new FileInputStream(file);
        
        // Create a Workbook instance
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        
        // Access the sheet named "Data"
        XSSFSheet sheet = workbook.getSheet("Data");
        
        // Read the value of the first cell (row 0, column 0)
        String cellValue = sheet.getRow(1).getCell(0).toString();
        
        // Print the value
        System.out.println("Cell Value: " + cellValue);
        
        
        int rows = sheet.getLastRowNum();
        int col = sheet.getRow(0).getLastCellNum();
        
        Object data[][] = new Object[rows][col];
        
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sheet.getRow(i).getCell(j);  
			}
		}
        
        System.out.println(data[1][1]); // Nasser
        
        // Always close the workbook
        workbook.close();
	}
}
