package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest12 {
	WebDriver wb;
	public String URL1="https://demoqa.com/upload-download";
	public String URL2="https://demoqa.com/alerts";
  @Test(enabled=false)
 public void uploading_a_file() {
	  wb.get(URL1);
	  wb.findElement(By.id("uploadFile")).sendKeys("\"C:\\Users\\pooja\\OneDrive\\Pictures\\Screenpresso\\2022-12-12_17h17_32.png\"");//uploading a file
  }
  @Test(enabled=true)
  public void Alerts() {
      wb.get(URL2);
	  wb.findElement(By.id("alertButton")).click();//clicking on alerts
      Alert alt=wb.switchTo().alert();//switch to alart pop up
      System.out.println("Alert:"+alt.getText());
      Thread.sleep(5000);
      alt.accept();//accept for clicking ok or yes
      Thread.sleep(5000);
      
      wb.findElement(By.id("timerAlertButton")).click();//click on popup with timer
      //wb.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implict wait
     WebDriverWait qwe=new WebDriverWait(wb,180);//explict wait for 180 seconds
     qwe.until(ExpectedConditions.alertIsPresent());//you are telling the web driver to accept or press ok only after the popup appear
     alt.accept();//clicking ok
     
     wb.findElement(By.id("confirmButton")).click();
     Thread.sleep(3000);
     alt.dismiss();
     Thread.sleep(3000);
     
     wb.findElement(By.id("promtButton")).click();
     Thread.sleep(3000);
     alt.sendKeys("pooja");
     alt.accept();
  }
 
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
  }
