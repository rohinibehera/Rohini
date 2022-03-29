package log;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnitPrgm {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\LIB\\chromedriver.exe");
		driver=new ChromeDriver();	
		}

	@Test
	void test() {
		
	}

}
