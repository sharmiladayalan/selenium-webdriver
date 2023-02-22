package maven234;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class orangeHRM1 {
	WebDriver wb=new ChromeDriver();
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");//setting the path for chrome driver
		WebDriver wb=new ChromeDriver();
		wb.manage().window().maximize();
		wb.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test
  public void login() throws InterruptedException {
	    wb.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(3000);
		wb.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(3000);
        wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(5000);
		wb.findElement(By.xpath("//*[@class='oxd-main-menu-item-wrapper'][1]")).click();
		
		
  }

  @AfterTest
  public void afterTest() {
  }
  
}
