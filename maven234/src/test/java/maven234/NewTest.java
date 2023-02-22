package maven234;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver wb;
    @BeforeTest
  public void beforeTest() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		 wb=new ChromeDriver();
		 wb.navigate().to(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(5000);
    
  }
    @Test
    public void login() throws InterruptedException, AWTException {
    	 wb.findElement(By.name("username")).sendKeys("Admin");
 		wb.findElement(By.name("password")).sendKeys("admin123");
 		wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
 		Thread.sleep(5000);
 		wb.findElement(By.xpath("//*[@class='oxd-main-menu-item-wrapper'][1]")).click();
 		Thread.sleep(3000);
		wb.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Anthony Nolan");
		Thread.sleep(3000);
		//wb.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
		//Thread.sleep(3000);
		//wb.findElement(By.xpath("//*[@class='//*[@class='oxd-select-text-input']'")).click();
		//Thread.sleep(3000);
		//wb.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("Ant");
		//wb.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
		//Thread.sleep(3000);
		//wb.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Robot rc=new Robot();
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		Thread.sleep(3000);
	   wb.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[6]/div/button[1]/i")).click();
	   Thread.sleep(3000);
	   wb.findElement(By.xpath("//*[@id=app]/div[3]/div/div/div/div[3]/button[2]")).click();
	   Alert alt=wb.switchTo().alert();
	   Thread.sleep(5000);
	   alt.accept();
   }
    
 @AfterTest
  public void afterTest() {
	
  }

}

