import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.navigate().to("https://demoqa.com/");
		Thread.sleep(5000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		wb.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\']/[1]")).click();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(6000);
	    wb.findElement(By.xpath("//*[@class=\'left-pannel\']/div/div[5]")).click();
	    Thread.sleep(6000);
		wb.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[4]")).click();
		Thread.sleep(6000);
	
	}
	
	

}
