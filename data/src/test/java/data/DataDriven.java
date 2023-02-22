package data;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class DataDriven {
	WebDriver wb;
	public String username2,password2;
	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  wb=new ChromeDriver();
		  wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(3000);
	 }
  public void datadriven() throws IOException, InterruptedException
  {
	  File excel =new File("C://Users//pooja//Downloads//Untitled spreadsheet.xlsx/");
	  FileInputStream fis=new FileInputStream(excel);
	  XSSFWorkbook book=new XSSFWorkbook(fis);
	  XSSFSheet sheet= book.getSheet("sheet1");
	  
	  int row_count= sheet.getLastRowNum();
	  for(int i=0;i<=row_count;i++)
	  {
		  String username1=sheet.getRow(i).getCell(0).getStringCellValue();
		  String password1=sheet.getRow(i).getCell(1).getStringCellValue();
		  wb.findElement(By.name("username")).sendKeys(username1);
	 	  wb.findElement(By.name("password")).sendKeys(password1);
	 	  wb.findElement(By.xpath("//*[@type='submit']")).click();
	 	  Thread.sleep(5000);
	 	   if (wb.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
	 	   {
	 		   System.out.println("error");
	 		wb.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
	 		Thread.sleep(3000);
	 		wb.findElement(By.linkText("Logout")).click();
	 		 Thread.sleep(5000);
	 	   }
	 	
	 	   else if(wb.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]")).isDisplayed()) 
	 	   {
	 		  for(int j=i+1;j<=row_count;j++) {
	 			   username2=sheet.getRow(j).getCell(0).getStringCellValue();
	 			   password2=sheet.getRow(j).getCell(1).getStringCellValue();
	 			  wb.findElement(By.name("username")).sendKeys(username2);
	 		 	  wb.findElement(By.name("password")).sendKeys(password2);
	 		 	  wb.findElement(By.xpath("//*[@type='submit']")).click();
	 		 	  Thread.sleep(5000);
	 		 	  
	 		 	  if (wb.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
	 		 	  {
	 		 		  System.out.println("error");
	 			 		wb.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
	 			 		Thread.sleep(3000);
	 			 		wb.findElement(By.linkText("Logout")).click();
	 			 		 Thread.sleep(5000);		   
	 		  }
	 	   }
	 		  break;
	 	   }
	 	   
	 	   }
	  book.close();
  } 
}  
  
 

  

