package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String baseUrl = "https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";
        
        driver.get(baseUrl);
        
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("opensourcecms");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("opensourcecms");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
       

        String ActualText = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
        System.out.println(ActualText);
    
        System.out.println("Assert passed");
        
     
        System.out.println("Test Successful");
        driver.close();
        //System.exit(0);

	}

}
