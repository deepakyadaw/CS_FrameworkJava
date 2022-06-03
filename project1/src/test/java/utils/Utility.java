package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(String fileName) {
		
		// for screenshot
	//	if(screenshotSubFolderName == null) {
				for (int i = 1; i <= 3; i++) {
					DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
					Date date = new Date();
					String date1 = dateFormat.format(date);
					System.out.println(date1);
			//		screenshotSubFolderName = date1.for

					File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					File dest = new File("F:\\SeleniumScreenSh\\capture " + date1 + ".jpg");
					FileHandler.copy(src, dest);
				}
				
				
			/*	
				
				
				public static void main(String[] args) throws IOException {

					String path = "F:\\market\\Book1.xlsx";
					FileInputStream file = new FileInputStream(path);

					Sheet sheet = WorkbookFactory.create(file).getSheet("prac");

					int lastrow = sheet.getLastRowNum();
					Row row = sheet.getRow(1);
					int lastcell = row.getLastCellNum();

					for (int i = 0; i < lastrow; i++) {
						for (int j = 0; j < lastcell; j++) {
							String value = sheet.getRow(i).getCell(j).getStringCellValue();
							System.out.print("" + value);
						}
						System.out.println();
					}
				}

	}*/

}
}