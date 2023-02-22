package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import javax.swing.text.AbstractDocument;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class mxplayer {
	WebDriver wb;
  @Test(enabled=false)
  public void shows() throws InterruptedException {
	  wb.findElement(By.xpath("//*[@id=\"app\"]/header/div/ul/div[2]/a/span")).click() ;
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"app\"]/section/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[5]/div/div/a/div/div/div/div[1]/img")).click();
	  Thread.sleep(3000);
	  }
  @Test(enabled=true)
  public void login() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor)wb;
	  js.executeScript("window.scrollby(-1,1000)");
	  wb.findElement(By.linkText("Login")).click() ;
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"mx-modal\"]/div[2]/div[3]/div/div/input")).sendKeys("6369910527");
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"mx-modal\"]/div[2]/div[3]/div/button")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  wb.get("https://www.mxplayer.in/");
	  wb.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() {
  }

}
