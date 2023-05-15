package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://Shop.DemoQA.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);

		String Title= driver.getTitle();
		System.out.println("Page title =" + Title);
		System.out.println("Length of title =  " +   Title.length());


		String url1= "https://www.google.com";

		try {

			String pgurl=driver.getCurrentUrl();
			System.out.println("Url of page = " + pgurl );
			Thread.sleep(3000);



			if(pgurl.equals(url1)) {

				System.out.println("Url Verified");
			}

		} catch (Exception e) {
			System.out.println("URL Verification fails");
		}

		String pgsrc= driver.getPageSource();
		System.out.println("Page source = " + pgsrc);
		System.out.println("page source length = " + pgsrc.length());

		driver.close();


	}

}
