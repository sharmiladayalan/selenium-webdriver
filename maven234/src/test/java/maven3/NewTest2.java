package maven3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTest2 {
	WebDriver dr;
	@BeforeTest
	public void beforeTest()throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");//setting the path for chrome driver
		dr=new ChromeDriver();
		dr.navigate().to("https://rahulshettyacademy.com/practice-project");
		 WebElement ab=dr.findElement(By.linkText("More"));
		 Actions act=new Actions(dr);
		 Thread.sleep(6000);
		 act.moveToElement((WebElement) dr).build().perform();
		 Robot rc=new Robot();
		 rc.keyPress(MenuKeyEvent.VK_DOWN);
		 rc.keyPress(MenuKeyEvent.VK_DOWN);
		 Thread.sleep(6000);
		 rc.keyPress(MenuKeyEvent.VK_UP);
	}
}
	
  
