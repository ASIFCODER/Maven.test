package org.Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver launchbrowser(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public static String title() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public String currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	public void QuitBrowser() {
		driver.quit();

	}

	public static WebElement sendkeys(WebElement ele, String data) {
		ele.sendKeys(data);
		return ele;
	}

	public static WebElement click(WebElement ele) {
		ele.click();
		return ele;
	}

	public static String readexceldata(int row, int cellnumber) throws Exception {
		String data;
		String path = "C:\\Users\\User\\eclipse-workspace\\Maven.tast\\exceldata\\asifdata.xlsx";
		File f = new File(path);
		FileInputStream filestream = new FileInputStream(f);
		Workbook wbook = new XSSFWorkbook(filestream);
		Sheet sheet = wbook.getSheet("data");
		Row rows = sheet.getRow(row);
		Cell cells = rows.getCell(cellnumber);

		int cellType = cells.getCellType();

		if (cellType == 1) {
			data = cells.getStringCellValue();
		} else {
			double numericCellValue = cells.getNumericCellValue();
			long covertlong = (long) numericCellValue;
			data = String.valueOf(covertlong);
		}
		return data;

	}

	public boolean resultvalidation(String expectedtitle, String Currenttitle) {

		if (expectedtitle.contentEquals(Currenttitle)) {
			System.out.println("Test pass");

		} else {
			System.out.println("Test Fails");
		}
		return false;
	}

}
