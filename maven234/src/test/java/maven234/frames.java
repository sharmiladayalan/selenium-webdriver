package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class frames {
	WebDriver wb;
  @Test
public void f() {
	  JavascriptExecutor js=(JavascriptExecutor)wb;
	  List<WebElement> frame =wb.findElements(By.tagName("iframe"));
	  System.out.println(frame);
	  System.out.println(frame.size());
	  for(int i=0;i<8;i++) {
		  String str=frame.get(i).getAttribute("id");
		  System.out.println(str);
	  }
	  wb.switchTo().frame("frame2");
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  wb.get("https://demoqa.com/frames");
  }

  @AfterTest
  public void afterTest() {
  }

}
