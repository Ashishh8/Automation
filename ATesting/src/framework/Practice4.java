package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='btn btn-primary-shadow btn-block']")).click();
		System.out.println("Registration button clicked");
		

		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("back button clicked");

		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("Forward button clicked");
		
		
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		Thread.sleep(2000);
		System.out.println("Homepage clicked");
		
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("Page refreshed");
		
		driver.close();
	}

}
