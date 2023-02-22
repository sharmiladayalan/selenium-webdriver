import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
	     WebDriver wb=new ChromeDriver();
		 
		 Thread.sleep(4000);
	     wb.navigate().to("https://demoqa.com/browser-windows");
	     String parentwindow=wb.getWindowHandle();//this one gets window handle id of the parent window
		 System.out.println(parentwindow);//this one prints the same
	     //wb.findElement(By.xpath("//*[@id='tabButton']")).click();
		WebElement we= wb.findElement(By.id("windowButton"));
	     for(int i = 0;i<3;i++) {
            we.click();
         Thread.sleep(4000);
        }
	     Set<String>allwindow=wb.getWindowHandles();
	     System.out.println(allwindow.size());
       // wb.findElement(By.xpath("//*[@id='messageWindowButton']")).click();
        Thread.sleep(4000);
        String lastwindow=" ";
        for(String string :allwindow)
        {
        	
			String handle = null;
			wb.switchTo().window(handle);
        	wb.get("www.google.com");
        	lastwindow=handle;
        }
        Thread.sleep(3000);
        String parent = null;
		wb.switchTo().window(parent);
        wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wb.close();
        wb.switchTo().window(lastwindow);
        wb.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");
        

	}

	}


