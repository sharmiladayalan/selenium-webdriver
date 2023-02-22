import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
        wb.navigate().to("https://demoqa.com/browser-windows");
        Robot rb=new Robot();
        wb.findElement(By.xpath("//*[@id='tabButton']")).click();
       // Alert alt=wb.switchTo().alert();
       // System.out.println("Alert:"+alt.getText());
        String parentwindow=wb.getWindowHandle();//this one gets window handle id of the parent window
        System.out.println(parentwindow);//this one prints the same
        Thread.sleep(4000);
       // alt.accept();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_TAB);
        for(int i = 0;i<4;i++) {
        	 wb.findElement(By.xpath("//*[@id='windowButton']")).click();
        	 Set<String> Stringallwindow = wb.getWindowHandles();
        	
        	 System.out.println(Stringallwindow);
        	 System.out.println(Stringallwindow.size());

             Thread.sleep(4000);
        }
       
        wb.findElement(By.xpath("//*[@id='messageWindowButton']")).click();
        Thread.sleep(4000);

	
	String[] Stringallwindow = null;
	for(String handle:Stringallwindow) {
		wb.switchTo().window(handle);
		wb.get("www.google.com");
	}

}
}

