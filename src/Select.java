import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("ss")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.name("ss")).sendKeys("amman"+Keys.ENTER+Keys.ENTER);

	}

}
