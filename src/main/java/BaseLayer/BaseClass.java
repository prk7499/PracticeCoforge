package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static void init() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cm= new ChromeOptions();
		cm.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(cm);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		
	}
}
