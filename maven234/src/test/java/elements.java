import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class elements {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.navigate().to("https://demoqa.com/");
		Thread.sleep(5000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		wb.findElement(By.xpath("//*[@class='category-cards']/div[1]")).click();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[1]")).click();
        wb.findElement(By.id("userName")).sendKeys("Pooja");
        wb.findElement(By.id("userEmail")).sendKeys("pooja12@gmail.com");
        wb.findElement(By.id("currentAddress")).sendKeys("k.v.kuppam,vellore dt");
        wb.findElement(By.id("permanentAddress")).sendKeys("vellore dt");
        Thread.sleep(5000);
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(5000);
        wb.findElement(By.xpath("//*[@class=\'btn btn-primary\']")).click();
        
        wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2] ")).click();
        wb.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();
       // wb.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
        Thread.sleep(5000);
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
       // wb.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
        Thread.sleep(5000);
       // wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[3]")).click();
       // Thread.sleep(3000);
        //wb.findElement(By.xpath("//*[@class=\"custom-control-lable\"][1]")).click();
        Thread.sleep(5000);
        
        wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
        Thread.sleep(5000);
        wb.findElement(By.id("edit-record-1")).click();
        wb.findElement(By.id("firstName")).clear();
        Thread.sleep(3000);
        wb.findElement(By.id("firstName")).sendKeys("pooja");
        Thread.sleep(3000);
        wb.findElement(By.id("lastName")).clear();
        wb.findElement(By.id("lastName")).sendKeys("D");
        Thread.sleep(3000);
        wb.findElement(By.id("userEmail")).clear();
        wb.findElement(By.id("userEmail")).sendKeys("pooja123@gmail.com");
        Thread.sleep(3000);
        wb.findElement(By.id("age")).clear();
        wb.findElement(By.id("age")).sendKeys("22");
        Thread.sleep(3000);
        wb.findElement(By.id("salary")).clear();
        wb.findElement(By.id("salary")).sendKeys("22000");
        wb.findElement(By.id("department")).clear();
        wb.findElement(By.id("department")).sendKeys("tester");
        wb.findElement(By.id("submit")).click();
        wb.findElement(By.id("delete-record-1")).click();
        Thread.sleep(5000);
        
        wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[5]")).click();
        WebElement as=wb.findElement(By.id("rightClickBtn"));
        Actions act=new Actions(wb);
        act.contextClick(as).build().perform();
        Thread.sleep(5000);
        WebElement qw=wb.findElement(By.id("doubleClickBtn"));
        act.doubleClick(qw).build().perform();
        Thread.sleep(3000);
       // WebElement rt=wb.findElement(By.id("button"));
       // act.click(rt).build().perform();
       // Thread.sleep(3000);
        
        wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[6]")).click();
        rb.keyPress(MenuKeyEvent.VK_DOWN);
        //wb.findElement(By.xpath("//*[@id='simpleLink")).click();
        rb.keyPress(MenuKeyEvent.VK_DOWN);
        rb.keyPress(MenuKeyEvent.VK_DOWN);
        rb.keyPress(MenuKeyEvent.VK_DOWN);
        Thread.sleep(5000);
        wb.findElement(By.xpath("//*[@id='created']")).click();
        wb.findElement(By.xpath("//*[@id='no-content']")).click();
        wb.findElement(By.xpath("//*[@id='moved']")).click();
        wb.findElement(By.xpath("//*[@id='bad-request']")).click();
        wb.findElement(By.xpath("//*[@id='unauthorized']")).click();
        wb.findElement(By.xpath("//*[@id='forbidden']")).click();
        wb.findElement(By.xpath("//*[@id='invalid-url']")).click();
        Thread.sleep(5000);
	}

}
