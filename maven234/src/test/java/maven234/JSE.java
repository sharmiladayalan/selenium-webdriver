package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JSE {
	WebDriver wd;
	 @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		  wd=new ChromeDriver();
		  wd.get("https://demoqa.com/text-box");
	  }

  @Test
public void tc1() throws InterruptedException {
	 JavascriptExecutor js=(JavascriptExecutor)wd;//it is replacing webdriver with script execute
	Thread.sleep(3000);
	//js.executeScript("history.go(0)");
	//js.executeScript("window.history.forword(0)");
	js.executeScript("document.getElementById('userName').value='pooja'");
	js.executeScript("document.getElementById('userEmail').value='pooja123@gmail.com'");
	js.executeScript("document.getElementById('currentAddress').value='vellore'");
	js.executeScript("document.getElementById('permanentAddress').value='vellore'");
	js.executeScript("document.getElementById('submit').click()");
	js.executeScript("window.ScrollBy(0,1000)");
	//js.executeScript("return document.title");
	//js.executeScript("return document.domain");
	//js.executeScript("return document.document.documentElement.innerText");
	System.out.println(js.executeScript("return document.domain"));
	System.out.println(js.executeScript("return document.title"));
	//System.out.println(js.executeScript("return document.getElementById('submit').innerText"));


	


  }
 
}
