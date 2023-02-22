package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class bookstore {
	WebDriver wb;
	public String URL="https://demoqa.com/books";
	public String URL1="https://demoqa.com/books";
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  wb.get(URL);
      wb.findElement(By.xpath("//*[@id=\"login\"]")).click();
      Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"newUser\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("pooja");
	  wb.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("d");
	  wb.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("poojad");
	  wb.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pooja@234");
	  //wb.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[2]")).click();
	  wb.findElement(By.xpath("//*[@id=\"register\"]")).click();
	  
  }
  @Test(enabled=true)
  public void f1() throws InterruptedException, AWTException {
	  wb.get(URL1);
      wb.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("Learning JavaScript Design Patterns\n");
      Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"basic-addon2\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"see-book-Learning JavaScript Design Patterns\"]/a")).click();
	  Thread.sleep(3000);
	  Robot rb=new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	 // wb.findElement(By.xpath("//*[@id=\"userName-value\"]")).click();
	 // Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
  }
}
