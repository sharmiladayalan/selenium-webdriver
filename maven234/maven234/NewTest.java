package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewTest {
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
      Alert alt=wb.switchTo().alert();
      Thread.sleep(5000);
      alt.accept();
  }

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
  }

}
