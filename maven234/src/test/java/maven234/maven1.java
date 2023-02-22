package maven234;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class maven1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");//setting the path for chrome driver
		WebDriver ad=new ChromeDriver();
		ad.manage().window().maximize();
		ad.navigate().to(" https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		//String Actual_Title=ad.getTitle();
		//String Expected_Title="OrangeHRM";
		//Assert.assertEquals(Actual_Title,Expected_Title);
		//System.out.println(Actual_Title);
		WebElement wb=ad.findElement(By.xpath("//*[@class=/'oxd-text oxd-text--p orangehrm-login-forgot-header/']"));
        Assert.assertEquals(true,wb.isDisplayed());
        ad.quit();
	}
}
