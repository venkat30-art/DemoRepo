package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //xpath
        driver.findElement(By.xpath("//input[@name ='firstname']")).clear();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("venkat");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='lastname']")).clear();
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("singam");
        
        Thread.sleep(3000);
        //css selector
        driver.findElement(By.cssSelector("input[name='reg_email__']")).clear();
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("ven@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).clear();
        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("123456");
        
        
        Thread.sleep(6000);
        driver.close();
        
	}

}
