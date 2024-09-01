package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

        // Open the web site
        driver.get("https://itgsoftware.com/");
        
        // Print a message to indicate the web site is opened successfully
        System.out.println("Website opened successfully");

        // Close the browser
        driver.quit();

	}

}
