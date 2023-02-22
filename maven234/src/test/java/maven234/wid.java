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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class wid {
	 
	WebDriver wb;
	 public String URL="https://demoqa.com/accordian";
	 public String URL1="https://demoqa.com/auto-complete";
	 public String URL2="https://demoqa.com/date-picker";
	 public String URL3="https://demoqa.com/slider";
	 public String URL4="https://demoqa.com/progress-bar";
	 public String URL5="https://demoqa.com/tabs";
	 public String URL6="https://demoqa.com/tool-tips";
	 public String URL7="https://demoqa.com/menu#";
	 public String URL8="https://demoqa.com/select-menu";
  @Test(enabled=false)
public void f() throws InterruptedException, AWTException {
	  wb.get(URL);
	  wb.manage().window().maximize();
	  wb.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();
	  Thread.sleep(3000);
	  Robot rb=new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	 
	  
	  wb.findElement(By.xpath("//*[@id=\"section3Heading\"]")).click();
	  Thread.sleep(3000);

  }
  @Test(enabled=false)
public void f1() throws InterruptedException {
	  Thread.sleep(3000);
	  wb.get(URL1);
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"autoCompleteMultipleInput\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]/div[1]/div[1]")).isSelected();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]/div[2]/div[1]")).click();
	  wb.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]/div[3]/div[1]")).click();
	  Thread.sleep(3000);
      wb.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]")).click();
      Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]/div[1]")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(enabled=false)
public void f2() throws InterruptedException, AWTException {
	  wb.get(URL2);
	  wb.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[78]")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(enabled=false)
public void f3() throws InterruptedException, AWTException {
	  wb.get(URL3);
	  wb.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"sliderValue\"]")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(enabled=true)
public void f4() throws InterruptedException, AWTException {
	  wb.get(URL4);
	  wb.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
	  Thread.sleep(3000);
      wb.findElement(By.xpath("//*[@id=\"resetButton\"]")).click();
	  Thread.sleep(3000);
  }
  @Test(enabled=true)
public void f5() throws InterruptedException, AWTException {
	  wb.get(URL5);
	  wb.findElement(By.xpath("//*[@id=\"demo-tab-what\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"demo-tab-origin\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"demo-tab-use\"]")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(enabled=true)
public void f6() throws InterruptedException, AWTException {
	  wb.get(URL6);
	  WebElement dr= wb.findElement(By.xpath("//*[@id=\"toolTipButton\"]"));
	  Thread.sleep(3000);
	  Actions act=new Actions(wb);
	  Thread.sleep(3000);
	  act.moveToElement(dr).build().perform();
	  WebElement qw=wb.findElement(By.xpath("//*[@id=\"toolTipTextField\"]"));
	  Thread.sleep(3000);
	  act.moveToElement(qw).build().perform();
	  Thread.sleep(3000);
	  WebElement as=wb.findElement(By.xpath("//*[@id=\"texToolTopContainer\"]/a[1]"));
	  Thread.sleep(3000);
	  act.moveToElement(as).build().perform();
	  Thread.sleep(3000);
  }
  @Test(enabled=true)
  public void f7() throws InterruptedException, AWTException {
	  wb.get(URL7);
      wb.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
  	  Thread.sleep(3000);
  	  wb.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a")).click();
  	  Thread.sleep(3000);
  	 wb.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")).click();
  	  Thread.sleep(3000);
  	// wb.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]")).click();
	//  Thread.sleep(3000);
	 // wb.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a")).click();
	 // Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a")).click();
	  Thread.sleep(3000);
	  
  }
  @Test(enabled=false)
  public void f8() throws InterruptedException, AWTException {
	  wb.get(URL8);
      wb.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[2]/div")).click();
  	  Thread.sleep(3000);
  	  wb.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]")).click();
	  Thread.sleep(3000);
	
	  wb.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[2]/div")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[2]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[2]/div[2]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[3]/div/div[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[4]/div/div[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"cars\"]/option[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"cars\"]/option[2]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"cars\"]/option[3]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"cars\"]/option[4]")).click();
	  Thread.sleep(3000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	 
	 
  }
}
  


