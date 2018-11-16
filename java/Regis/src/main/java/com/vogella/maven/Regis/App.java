package com.vogella.maven.Regis;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App 
{
	
	    @SuppressWarnings("deprecation")
		public static void main(String[] args) throws Exception {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\thirumamagalm\\Downloads\\chromedriver.exe");

			// Initialize browser
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.freecrm.com");

			// Maximize browser

			driver.manage().window().maximize();

			Thread.sleep(2000);

			WebElement navelement = driver.findElement(By.xpath("(//*[text()='Sign Up'])[1]"));

			navelement.click();

			Select dropdown = new Select(driver.findElement(By.id("payment_plan_id")));
			dropdown.selectByVisibleText("Free Edition");

			driver.findElement(By.name("first_name")).clear();
			driver.findElement(By.name("first_name")).sendKeys("Thiruma");

			driver.findElement(By.name("surname")).clear();
			driver.findElement(By.name("surname")).sendKeys("Sri");

			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("thiruma@gmail.com");

			driver.findElement(By.name("email_confirm")).clear();
			driver.findElement(By.name("email_confirm")).sendKeys("thiruma@gmail.com");
	        File f= new File("D://Regis.xlsx");
	        
	        FileInputStream fi=new FileInputStream(f);
	        
	        Workbook workbook = new XSSFWorkbook(fi);
	        
	        Sheet datatypeSheet = workbook.getSheetAt(0);
	        ArrayList<String> columndata = null;

	        Iterator<Row> rowIterator = datatypeSheet.iterator();
	        columndata = new ArrayList<String>();

	        while (rowIterator.hasNext()) {
	            Row nextRow = rowIterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	             
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_STRING:
	                    	driver.findElement(By.name("username")).clear();
	                		WebElement userna = driver.findElement(By.name("username"));
	                		userna.sendKeys(cell.getStringCellValue());
	                		userna.getText();
	                		System.out.println(By.name(userna.getAttribute("value")));
//	                         break;
//	                    case Cell.CELL_TYPE_BOOLEAN:
//	                        System.out.print(cell.getBooleanCellValue());
//	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                    	 driver.findElement(By.name("password")).clear();
	                    	 WebElement pass = driver.findElement(By.name("password"));
	                    	pass.sendKeys(cell.getStringCellValue());
	                    	pass.getText();
	                        System.out.print(By.name(pass.getAttribute("value")));
	                        break;
	                                       
	                       
	                }
	                System.out.print("  ");
	            }
	            System.out.println();
	          
	        }
	         
	        workbook.close();
	        
	        driver.findElement(By.name("passwordconfirm")).clear();
            WebElement pass1 = driver.findElement(By.name("password"));
        	pass1.sendKeys(pass1.getAttribute("value"));
        	pass1.getText();
            System.out.print(By.name(pass1.getAttribute("value")));
			
			
			driver.findElement(By.name("agreeTerms")).click();

			driver.findElement(By.name("submitButton")).click();
			
			driver.quit();
	    }

		
		
	    
		             
	                    }
	                                

