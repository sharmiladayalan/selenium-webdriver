package maven234;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class EXTENTREPORT {
    ExtentReports extent;
    ExtentTest logger;
    WebDriver wd;
  @BeforeTest
  public void beforeTest() {
	  extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/moolya.html",true);//try to save the html file in the test output folder by the name of maven234
	  extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent.config.xml"));//try to load configu to the html file by saving in the src/test/java folder
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
  }
  @Test
  public void login() throws InterruptedException {
	  logger=extent.startTest("demo");//this indicates that logger will have a influence on the test
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  logger.log(LogStatus.PASS,"web page has opened");//in the report we will have a record of the steps performed
	  Thread.sleep(3000);
	  String title =wd.getTitle();
	  logger.log(LogStatus.PASS, title);
	  
	  Assert.assertEquals("demo", "demo");
	  logger.log(LogStatus.PASS,"Assert Passed");
	  Thread.sleep(3000);
	  
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  logger.log(LogStatus.PASS,"user name is passed");
	  Thread.sleep(3000);
	  
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  logger.log(LogStatus.PASS,"password  is passed");
	  Thread.sleep(3000);
	  
	  wd.findElement(By.xpath("//*[@type='submit']")).click();
	  logger.log(LogStatus.PASS,"log in successfull");
	  Thread.sleep(3000);
  }
	  @Test(dependsOnMethods="login")
	  public void logout() throws InterruptedException {
		  Thread.sleep(5000);
		  wd.findElement(By.xpath("//*[@class='oxd-userdropdown-ing']")).click();
		  logger.log(LogStatus.PASS,"clicking on thr dropdown");
		  Thread.sleep(3000);
		  wd.findElement(By.linkText("logout")).click();
		  logger.log(LogStatus.PASS,"logout");
		  
		  
	  }
	  
  
  @AfterTest
  public void afterTest() {
	  wd.close();
	  extent.endTest(logger);//this will end the function of logger
	  extent.flush();//this will flush all the logged data in the html
	  extent.close();// end to the report
  }

}
