package sendkeys01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver",
    "F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe" );
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       driver.findElement(By.name("firstname"));
       driver.findElement(By.name("firstname")).sendKeys("venkat");
       Thread.sleep(2000);
       driver.findElement(By.name("lastname"));
       driver.findElement(By.name("lastname")).sendKeys("singam");
       Thread.sleep(2000);
       driver.findElement(By.name("reg_email__"));
       driver.findElement(By.name("reg_email__")).sendKeys("9030447768");
       Thread.sleep(3000);
       driver.findElement(By.linkText("Account security"));
       driver.findElement(By.linkText("Account security")).click();
       Thread.sleep(2000);
       driver.findElement(By.partialLinkText("Pages")).click();
       Thread.sleep(5000);
       driver.close();
	}
	

}
