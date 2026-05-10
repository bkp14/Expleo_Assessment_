package ITestListeners;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class ExeclDataProvider {
    @DataProvider(name = "vdatas")
    public static Object[][] validDatas() throws IOException {
        return exceldataProvider("tutnv");
    }
    @DataProvider(name = "ivdatas", parallel = true)
    public static Object[][] inValidDatas() throws IOException {
        return exceldataProvider("tutniv");
    }
    public static Object[][] exceldataProvider(String sheet) throws IOException {
        String path = "C:\\Users\\Muhindhar S V\\eclipse-workspace\\Website\\src\\test\\resources\\tnTestData.xlsx";
        return exceldataReader(path, sheet);
    }
    public static Object[][] exceldataReader(String file, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);
        int rows = sheet.getPhysicalNumberOfRows();
        int cells = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rows - 1][cells];
        DataFormatter format = new DataFormatter();

        for (int i = 1; i < rows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < cells; j++) {
                XSSFCell cell = row.getCell(j);
                data[i - 1][j] = format.formatCellValue(cell);
            }
        }
        wb.close();
        fis.close();
        return data;
    }
}