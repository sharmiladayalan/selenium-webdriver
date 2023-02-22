package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class interactions {
	WebDriver wb;
	 public String URL="https://demoqa.com/sortable";
	 public String URL1="https://demoqa.com/selectable";
	 public String URL2="https://demoqa.com/resizable";
	 public String URL3="https://demoqa.com/dragabble";
  @Test(enabled=true)
  public void f() throws InterruptedException {
	  wb.get(URL);
	 WebElement as= wb.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
     WebElement az=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]"));
     Actions act=new Actions(wb);
     act.dragAndDrop(as, az).build().perform();
     WebElement a1=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[3]"));
     WebElement a2=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]"));
	 act.dragAndDrop(a1, a2).build().perform();
	 WebElement b1=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[5]"));
     WebElement b2=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[6]"));
	 act.dragAndDrop(b1,b2).build().perform();
	 
	 wb.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]")).click();
	 Thread.sleep(3000);
	 WebElement z1=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
     WebElement z2=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[2]"));
	 act.dragAndDrop(z1,z2).build().perform();
	 WebElement z3=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[4]"));
     WebElement z4=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[7]"));
	 act.dragAndDrop(z3,z4).build().perform();
	 WebElement z5=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[5]"));
     WebElement z6=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[6]"));
	 act.dragAndDrop(z5,z6).build().perform();
	 WebElement z7=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[8]"));
     WebElement z8=wb.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]"));
	 act.dragAndDrop(z7,z8).build().perform();
  }
  @Test(enabled=false,invocationCount = 5)
  public void f1() throws InterruptedException {
	  wb.get(URL1);
      wb.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
      wb.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
      Thread.sleep(3000);
     
      wb.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]")).click();
      wb.findElement(By.xpath("//*[@id=\"row1\"]/li[1]")).click();
      Thread.sleep(3000);
      wb.findElement(By.xpath("//*[@id=\"row1\"]/li[2]")).click();
     
      wb.findElement(By.xpath("//*[@id=\"row3\"]/li[3]")).click();
      Thread.sleep(3000);
      
  }
  @Test(enabled=true)
  public void f2() throws InterruptedException {
	  wb.get(URL2);
      wb.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]")).click();
      Thread.sleep(3000);
      WebElement as=wb.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
      Actions act=new Actions(wb);
      act.clickAndHold(as).build().perform();
      Thread.sleep(3000);
      WebElement as1=wb.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[1]"));
      act.release(as1).build().perform();
      wb.findElement(By.xpath("//*[@id=\"resizable\"]")).click();
      WebElement as2=wb.findElement(By.xpath("//*[@id=\"resizable\"]/span"));
      act.clickAndHold(as2).build().perform();
      WebElement as3=wb.findElement(By.xpath("//*[@id=\"resizable\"]"));
      act.release(as3).build().perform();
  }
  @Test(enabled=true)
  public void f3() throws InterruptedException {
	  wb.get(URL3);
     WebElement a1= wb.findElement(By.xpath("//*[@id=\"dragBox\"]"));
     WebElement a2= wb.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]"));
     Actions act=new Actions(wb);
     act.dragAndDrop(a1, a2).build().perform();
      Thread.sleep(3000);
      wb.findElement(By.xpath("//*[@id=\"draggableExample-tab-axisRestriction\"]")).click();
      WebElement a3= wb.findElement(By.xpath("//*[@id=\"restrictedY\"]"));
      WebElement a4= wb.findElement(By.xpath("//*[@id=\"restrictedX\"]"));
      act.dragAndDrop(a3, a4).build().perform();
       Thread.sleep(3000);
       wb.findElement(By.xpath("//*[@id=\"draggableExample-tab-containerRestriction\"]")).click();
       WebElement a5= wb.findElement(By.xpath("//*[@id=\"containmentWrapper\"]/div"));
       WebElement a6= wb.findElement(By.xpath("//*[@id=\"containmentWrapper\"]"));
       act.dragAndDrop(a5, a6).build().perform();
        Thread.sleep(3000);
        WebElement a7= wb.findElement(By.xpath("//*[@id=\"draggableExample-tabpane-containerRestriction\"]/div[2]/span"));
        WebElement a8= wb.findElement(By.xpath("//*[@id=\"draggableExample-tabpane-containerRestriction\"]/div[2]"));
        act.dragAndDrop(a7, a8).build().perform();
         Thread.sleep(3000);
         wb.findElement(By.xpath("//*[@id=\"draggableExample-tab-cursorStyle\"]")).click();
         WebElement a9= wb.findElement(By.xpath("//*[@id=\"cursorCenter\"]"));
         WebElement a10= wb.findElement(By.xpath("//*[@id=\"cursorBottom\"]"));
         act.dragAndDrop(a9, a10).build().perform();
          Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	 
  }

 

}
