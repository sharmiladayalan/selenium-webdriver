import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get(" https://demoqa.com/droppable");
		Thread.sleep(5000);
        WebElement l1=wb.findElement(By.id("draggable"));
        WebElement l2=wb.findElement(By.id("droppable"));
		Thread.sleep(5000);
        Actions act=new Actions(wb);
        act.dragAndDrop(l1, l2).build().perform();
	}

}
