package testNg2;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver dr;
	public String URL1="https://www.google.com/";
	public String URL2="https://ww.amazon.in/";
	@BeforeTest
	public void beforreTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(URL1);
	}
	@Test
  
  public void actions() throws AWTException, InterruptedException {
		WebElement link=dr.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		//link.click();
		Actions act=new Actions(dr);
		act.contextClick(link).build().perform();
		
		Robot rb=new Robot();
		Thread.sleep(3000);
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(3000);
		rb.keyPress(MenuKeyEvent.VK_CONTROL);
		rb.keyPress(MenuKeyEvent.VK_TAB);
		
		WebElement abc=dr.findElement(By.xpath("//*[contains(text(),'Creat an account')]"));
		Actions a=new Actions(dr);
		a.contextClick(abc).build().perform();
		//Robot rc=new Robot();
		//rc.keyPress(MenuKeyEvent.VK_DOWN);
		////rc.keyPress(MenuKeyEvent.KEY_RELEASED);
		//rc.keyPress(MenuKeyEvent.VK_ENTER);
		//rc.keyPress(MenuKeyEvent.VK_CONTROL);
		//rc.keyPress(MenuKeyEvent.VK_TAB);
		
		 }
	@AfterTest
	public void afterTest() {
		
	}
}
