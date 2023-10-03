package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// find web element age input box
		String actualTooltip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");

		String expectedTooltip = "We ask for your name only for statistical purposes.";

		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}
	}

}
