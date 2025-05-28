package com.freecrm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.freecrm.base.TestBase;

public class TestUtils extends TestBase {

	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void takePicture(String name) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Emad\\eclipse-workspace\\hello\\Snapshots\\" + name + ".png"));

	}
	
	public Object [][] getDataFromExcel(String sheetName) throws IOException {
		// Correct the file path (no extra quotes inside)
        File file = new File("D:\\TestData.xlsx");
        
        // Read the file
        FileInputStream fis = new FileInputStream(file);
        
        // Create a Workbook instance
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        
        // Access the sheet named "Data"
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int rows = sheet.getLastRowNum();
        int col = sheet.getRow(0).getLastCellNum();
        
        Object data[][] = new Object[rows][col];
        
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();  
			}
		}
        
        return data;
	}

}
