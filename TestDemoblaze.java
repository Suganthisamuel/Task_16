import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("---Start");
		
		WebDriver driver = new ChromeDriver(options);
		
		try {
			
			driver.get("http://demoblaze.com");
			
			String expectedTitle = "STORE";
			String actualTitle = driver.getTitle();
			
			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Page landed on correct website");
			} else {
				System.out.println("Page not landed on correct website");
			}	
		} finally {
			driver.quit();
				
		}

	}

}
