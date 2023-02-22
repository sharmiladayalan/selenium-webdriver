package testNg2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class parallelTest1{
	WebDriver wd;
	@Parameter(mybrowser)
 
  @BeforeTest
  public void beforeTest(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
		}
		else(mybrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd=new FirefoxDriver();
		}
		if(mybrowser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			wd=new SafariDriver();
		}
		
  }
	 @Test
	  public void orangrhrm() {
		 Thread.sleep(5000);
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 wd.findElement(By.name("username")).sendKeys("admin");
		 wd.findElement(By.name("password")).sendKeys("admin123");
		 Thread.sleep(5000);
	  }

  @AfterTest
  public void afterTest() {
  }

}
