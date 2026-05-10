package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datas {
	@DataProvider(name="Logindata")
	public Object[][] excelDataProvider() throws IOException {
		return getExcelData("D:\\Selenium_Assessment\\Assessment2\\src\\test\\resources\\Book1.xlsx", "Sheet1");
	}
	@DataProvider(name="RegisterData")
	public Object[][] excelDataProvider1() throws IOException {
		return getExcelData("D:\\Selenium_Assessment\\Assessment2\\src\\test\\resources\\Book1.xlsx", "Sheet2");
	}
	@DataProvider(name="InvalidLogin")
	public Object[][] excelDataProvider2() throws IOException {
		return getExcelData("D:\\Selenium_Assessment\\Assessment2\\src\\test\\resources\\Book1.xlsx", "Sheet3");
	}
	public String[][] getExcelData(String filename, String sheetName) throws IOException {
	    FileInputStream fs=new FileInputStream(filename);
	    XSSFWorkbook wb = new XSSFWorkbook(fs);
	    XSSFSheet sheet = wb.getSheet(sheetName);
	    int noOfRows = sheet.getPhysicalNumberOfRows();
	    int noOfCols = sheet.getRow(0).getLastCellNum();
	    DataFormatter formatter = new DataFormatter();
	    String[][] temp = new String[noOfRows - 1][noOfCols];
	    int count = 0;
	    for (int i = 1; i < noOfRows; i++) {
	        XSSFRow row = sheet.getRow(i);
	        if (row == null) continue;
	        boolean isEmpty = true;
	        for (int j = 0; j < noOfCols; j++) {
	            Cell cell = row.getCell(j);
	            String value = formatter.formatCellValue(cell);
	            if (!value.trim().isEmpty()) {
	                isEmpty = false;
	                break;
	            }
	        }
	        if (isEmpty) continue;
	        for (int j = 0; j < noOfCols; j++) {
	            Cell cell = row.getCell(j);
	            temp[count][j] = formatter.formatCellValue(cell);
	        }
	        count++;
	    }
	    String[][] data = new String[count][noOfCols];
	    for (int i = 0; i < count; i++) {
	        data[i] = temp[i];
	    }
	    wb.close();
	    fs.close();
	    return data;
	}
}