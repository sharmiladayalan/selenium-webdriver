package pooja;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pooja1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");//setting the path for chrome driver
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class=\'oxd-text oxd-text--span oxd-main-menu-item--name\'])[2]")).click();//PIM
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\']")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\'])[6]")).click();
		wd.findElement(By.xpath("//*[@class=\"class=\"oxd-icon\"\']")).click();
        File scr=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr,new File("C:\\Users\\pooja\\OneDrive\\Pictures\\Screenshots\scr.png"));//for taking screenshots
		

}

	
	}
