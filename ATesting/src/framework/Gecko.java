package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gecko {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();


		String title = driver.getTitle();
		System.out.println("Title of page is =" + title);

		WebElement uname= driver.findElement(By.xpath("//*[@id='userName']"));
		WebElement pwd= driver.findElement(By.xpath("//*[@id='password']"));
		WebElement login= driver.findElement(By.xpath("//*[@id='login']"));

		uname.sendKeys("testuser");
		Thread.sleep(1000);
		pwd.sendKeys("Password@123");
		Thread.sleep(3000);
		login.click();
		Thread.sleep(3000);
		System.out.println("logged in");


		try {

			WebElement logout= driver.findElement(By.xpath("//*[@id='submit']"));
			String url=driver.getCurrentUrl();
			String pgsrc=driver.getPageSource();

			if (logout.isDisplayed()){

				logout.click();
				System.out.println("Successful logout");
				System.out.println("current url is =" + url);
				System.out.println("Page source is =" + pgsrc);
			}


		} catch (Exception e) {

			System.out.println("Incorrect login");
		}

		driver.close();
		//driver.quit();   ---> Recommended as it closes all windows and releases the driver
	}

}
