package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class forms {
	 WebDriver wb;
	 public String URL="https://demoqa.com/automation-practice-form";
  @Test
  public void f() throws InterruptedException {
	  wb.findElement(By.id("firstName")).sendKeys("pooja");
	  Thread.sleep(3000);
	  wb.findElement(By.id("lastName")).sendKeys("D");
	  Thread.sleep(3000);
	  wb.findElement(By.id("userEmail")).sendKeys("pooja23@gmail.com");
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]")).click();
	 Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9898767890");
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
	  Thread.sleep(3000);
	 // wb.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
	 // Thread.sleep(3000);
	 // wb.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]")).click();
	  //Thread.sleep(3000);
	//  wb.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).click();
	 // Thread.sleep(3000);
	 // wb.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[101]")).click();
	 // Thread.sleep(3000);
	 // wb.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]")).click();
	//  Thread.sleep(3000);
	  //wb.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("\"C:\\Users\\pooja\\OneDrive\\Pictures\\Screenpresso\\2022-12-12_09h05_12.png\"");
	  wb.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("vellore");
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  wb.get(URL);
  }
}
 


