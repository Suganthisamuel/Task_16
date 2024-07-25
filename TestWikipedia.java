import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Start");
		
		WebDriver driver = new ChromeDriver(options);
		
		try {
			driver.get("http:\\wikipedia.org");
			
			WebElement searchInput = driver.findElement(By.id("searchInput"));
			searchInput.sendKeys("Artificial Intelligence");
            searchInput.submit();
			Thread.sleep(2000);
			
			WebElement historyLink = driver.findElement(By.xpath("//a[@href='/wiki/History_of_artificial_intelligence']"));
            historyLink.click();
            Thread.sleep(2000);
            
            WebElement historySection = driver.findElement(By.id("firstHeading"));
            System.out.println("Title of the section: " + historySection.getText());
			
		} catch (Exception e) {
		  e.printStackTrace();
		}finally {
			driver.quit();
		}

	}

}
