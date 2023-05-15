package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows/");
//		String url= "https://demoqa.com/browser-windows/";
//		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='windowButton']")).click();
		System.out.println("New browser window button clicked");
		
		driver.close();
	}

}
