package maven234;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class parellel3 {
	
	WebDriver wd;
	@Parameters("mybrowser")
 
  @BeforeTest
  public void beforeTest(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
		}
		else if(mybrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd=new FirefoxDriver();
		}
		else if(mybrowser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			wd=new SafariDriver();
		}
		
  }
	 public void orangrhrm() throws InterruptedException {
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

