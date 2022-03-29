package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogProgramme {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		Logger logger= Logger.getLogger("Hyderabadreport");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","D:\\LIB\\chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("Browser Opened");
		
		driver.manage().window().maximize();
		logger.info("Browser maximized");
		
		driver.get("http://www.hyderabadreport.com");
		logger.info("Url is Opened");
		
		

	}

}
