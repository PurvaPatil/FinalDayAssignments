package com.cg.ExcelDemo;


import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelTest {
	//File src = new File("D:\\Module3Workspace\\ExcelDemo\\src\\test\\java\\com\\cg\\ExcelDemo\\exceldemo.xls");
	WebDriver driver=null;

	@org.junit.Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\NewChromedriver\\chromedriver.exe");		
	}

	@org.junit.Test
	public void csvDataRead() throws IOException, BiffException, InterruptedException {
		
		
		String FilePath = "D:\\Module3Workspace\\ExcelDemo\\exceldemo1.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		// TO get the access to the sheet
		Sheet sh = wb.getSheet("Sheet1");
		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();
		// To get the number of columns present in sheet
		//int totalNoOfCols = sh.getColumns();		

		for (int row = 0; row < totalNoOfRows; row++) {
			driver = new ChromeDriver();
			driver.get("D:\\Module3Workspace\\ExcelDemo\\src\\main\\webapp\\excelData.html");
				//System.out.print(sh.getCell(col, row).getContents() + "\t");				
					String id=sh.getCell(0, row).getContents();
					driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/input")).sendKeys(id);
					String name=sh.getCell(1, row).getContents();
					driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/input")).sendKeys(name);				
					String dept=sh.getCell(2, row).getContents();
					driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/input")).sendKeys(dept);
					Thread.sleep(1000);
					driver.findElement(By.name("submit")).click();					
			}
		driver.close();
		}
}
