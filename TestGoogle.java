import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	driver.quit();
	}

}
