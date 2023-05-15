package framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class RunME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Data\\Desktop\\chromedriver\\chromedriver.exe");  

		// Instantiate a ChromeDriver class.       
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

		//driver.findElement(By.cssSelector("div :nth-child(6)")).click();
		//System.out.println("Book store clicked");
		
		WebElement book=driver.findElement(By.xpath("//*[text()='Book Store Application']/../.."));
		book.click();
		
		//driver.findElement(By.xpath("//span[@id='see-book-Git Pocket Guide']")).click();
		
		//driver.findElement(By.id("see-book-Git Pocket Guide")).click();
	
		System.out.println("pockt clicked");

		int size =driver.findElements(By.xpath("//div[@class=\"rt-table\"]//a")).size();
		
		for(int i=0;i<size;i++)
		{
			driver.findElements(By.xpath("//div[@class=\"rt-table\"]//a")).get(i).click();
			Thread.sleep(3000);
			driver.findElement(By.id("addNewRecordButton")).click();
			Thread.sleep(3000);
			
		}




	}

}
