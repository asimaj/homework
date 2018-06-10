package lead_Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class Workbook {
	public  Object[][] readExcel() throws IOException {
		FileInputStream fis=new FileInputStream(new File("./data/createlead.xlsx"));
		XSSFWorkbook Wbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= Wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastcellNum = sheet.getRow(0).getLastCellNum();
		Object[][]data =new Object[lastRowNum][lastcellNum];
		System.out.println("row count"+lastRowNum+"Cell Count"+lastcellNum);
		for(int i=0;i<=lastRowNum;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastcellNum;j++) {
				String Value = row.getCell(j).getStringCellValue();
				data[i-1][j]=Value;
				System.out.println(Value);
			}
		}
		Wbook.close();
		fis.close();
		return data;
	}
}
