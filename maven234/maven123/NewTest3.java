package maven123;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver dr;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.navigate().to("https://rahulshettyacademy.com/practice-project");
		WebElement wb=dr.findElement(By.linkText("More"));
		Actions act=new Actions(dr);
		Thread.sleep(6000);
		act.moveToElement(wb).build().perform();
		 Robot rc=new Robot();
		 WebElement link=dr.findElement(By.xpath("//*[@class='nav-outer clearfix']/nav/div[2]/ul/li[1]")));
		 Actions act=new Actions(dr);
		 act.moveToElement(link).build().perform();
		 Thread.sleep(6000);
		 rc.keyPress(MenuKeyEvent.VK_DOWN);
		 rc.keyPress(MenuKeyEvent.VK_DOWN);
		 Thread.sleep(6000);
		 rc.keyPress(MenuKeyEvent.VK_UP);
	}
}

 
